import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Implements the StockReaderInterface to read  data.
 */
public class StockReader implements StockReaderInterface {
    private Map<String, Stock> stockData;

    /**
     * Constructor that start the reader and loads data from the file.
     * @param filePath the path to the TSV data file
     */
    public StockReader(String filePath) {
        stockData = new HashMap<>();
        loadData(filePath);
    }

    /**
     * Loads data from the file into the hash map.
     * @param filePath the path to the file
     */
    private void loadData(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                parseAndStore(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    /**
     * Parses a single line of tsv file and stores it in the map.
     * @param line the line of text to parse
     */
    private void parseAndStore(String line) {
        String[] parts = line.split("\t");
        if (parts.length >= 5) {
            try {
                String date = parts[0].trim();
                double open = Double.parseDouble(parts[1].trim());
                double high = Double.parseDouble(parts[2].trim());
                double low = Double.parseDouble(parts[3].trim());
                double close = Double.parseDouble(parts[4].trim());
                stockData.put(date, new Stock(date, open, high, low, close));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Gets the stock data for a target date.
     * @param date target date, e.g., "12/29/25"
     * @return Stock objector null if not found
     */
    @Override
    public Stock getStock(String date) {
        return stockData.get(date);
    }
}