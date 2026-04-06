import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Client code to request stock data from the server over the network.
 */
public class StockClient {
    private static final String HOST = "localhost";
    private static final int PORT = 8080;

    /**
     * Main execution method for the client.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Stock client");
        try (Socket socket = new Socket(HOST, PORT);
             Scanner scanner = new Scanner(System.in)) {
            runClientLoop(socket, scanner);
        } catch (Exception e) {
            System.err.println("Client error " + e.getMessage());
        }
    }

    /**
     * Manages the input loop for the user to request dates.
     * @param socket the active connection socket
     * @param scanner the scanner for user input
     * @throws Exception if an I/O error occurs
     */
    private static void runClientLoop(Socket socket, Scanner scanner) throws Exception {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        InputStream inStream = socket.getInputStream();
        ObjectInputStream in = new ObjectInputStream(inStream);

        while (true) {
            System.out.print("Enter date or q to end: ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("q")) break;
            sendRequestAndPrint(input, out, in);
        }
    }

    /**
     * Sends a request to the server and prints the response.
     * @param date the requested date
     * @param out the buffered writer to the server
     * @param in the object input stream from the server
     * @throws Exception if an I/O error occurs
     */
    private static void sendRequestAndPrint(String date, BufferedWriter out, ObjectInputStream in) throws Exception {
        System.out.println("Sending date: " + date);
        out.write(date + "\n");
        out.flush();

        Object response = in.readObject();
        if (response instanceof Stock) {
            Stock stock = (Stock) response;
            if (stock.getDate().equals("NULL")) {
                System.out.println("No data available for this date ");
            } else {
                printStock(stock);
            }
        }
    }

    /**
     * Formats and prints a Stock object.
     * @param stock the stock to print
     */
    private static void printStock(Stock stock) {
        System.out.println("Date: " + stock.getDate());
        System.out.println("Open: " + stock.getOpen());
        System.out.println("High: " + stock.getHigh());
        System.out.println("Low: " + stock.getLow());
        System.out.println("Close: " + stock.getClose());
    }
}