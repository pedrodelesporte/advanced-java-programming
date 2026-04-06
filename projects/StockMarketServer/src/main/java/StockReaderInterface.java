/**
 * Stock reader interface to read historical stock data from a target file.
 */
public interface StockReaderInterface {


    /**
     * Get Stock for Target Date.
     * @param date target date, e.g. 12/29/25
     * @return Stock object.
     */
    public Stock getStock(String date);
}
