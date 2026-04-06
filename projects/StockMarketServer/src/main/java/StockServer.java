import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Multithreaded server using a Thread Pool to handle stock requests.
 */
public class StockServer {
    private static final int PORT = 8080;
    private static final int POOL_SIZE = 10;
    private StockReaderInterface stockReader;
    private ExecutorService threadPool;

    /**
     * Constructor that stars the server resources.
     * @param dataPath path to the stock data file
     */
    public StockServer(String dataPath) {
        this.stockReader = new StockReader(dataPath);
        this.threadPool = Executors.newFixedThreadPool(POOL_SIZE);
    }

    /**
     * Starts listening for client connections.
     */
    public void start() {
        System.out.println("Starting server at " + new Date());
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            acceptClients(serverSocket);
        } catch (IOException e) {
            System.err.println("Server exception " + e.getMessage());
        }
    }

    /**
     * Loop to accept incoming client connections continuously.
     * @param serverSocket the server socket
     * @throws IOException if an error occurs while accepting
     */
    private void acceptClients(ServerSocket serverSocket) throws IOException {
        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("New client was connected");
            HandleStockRequest handler = new HandleStockRequest(clientSocket, stockReader);
            threadPool.execute(handler);
        }
    }

    /**
     * Main method to launch the server.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        StockServer server = new StockServer("data/sp500_2025.tsv");
        server.start();
    }
}