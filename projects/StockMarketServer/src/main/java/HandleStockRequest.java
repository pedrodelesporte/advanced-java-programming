import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Runnable class that handles individual client stock requests
 */
public class HandleStockRequest implements Runnable {
    private Socket clientSocket;
    private StockReaderInterface stockReader;

    /**
     * Constructor for the request handler.
     * @param socket the client socket
     * @param reader the stock reader instance
     */
    public HandleStockRequest(Socket socket, StockReaderInterface reader) {
        this.clientSocket = socket;
        this.stockReader = reader;
    }

    /**
     * The main execution
     */
    @Override
    public void run() {
        try (
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream())
        ) {
            processClientLoop(in, out);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Processes requests in a loop until the client disconnects
     * @param in the input reader
     * @param out the object output stream
     * @throws Exception if an I/O error occurs
     */
    private void processClientLoop(BufferedReader in, ObjectOutputStream out) throws Exception {
        String requestDate;
        while ((requestDate = in.readLine()) != null) {
            System.out.println("Got client request for date: " + requestDate);
            Stock stock = stockReader.getStock(requestDate.trim());
            sendResponse(out, stock);
        }
    }

    /**
     * Sends the Stock response back to the client.
     * @param out the output stream
     * @param stock the Stock object to send
     * @throws Exception if an I/O error occurs
     */
    private void sendResponse(ObjectOutputStream out, Stock stock) throws Exception {
        if (stock != null) {
            out.writeObject(stock);
        } else {
            out.writeObject(new Stock("NULL", 0, 0, 0, 0));
        }
        out.flush();
    }
}