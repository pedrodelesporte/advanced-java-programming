import java.io.Serializable;


/**
 * Encapsulates Stock Data for a Specific Date.
 */
public class Stock implements Serializable {
    private String date;
    private double open;
    private double high;
    private double low;
    private double close;


    /**
     * Constructor.
     * @param date e.g. "12/29/25"
     * @param open open value.
     * @param high high value.
     * @param low low value.
     * @param close close value.
     */
    public Stock(String date, double open, double high, double low, double close) {
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
    }


    /**
     * Get Date, e.g. "12/29/25".
     * @return date.
     */
    public String getDate() {
        return date;
    }


    /**
     * Get Open Value.
     * @return open value.
     */
    public double getOpen() {
        return open;
    }


    /**
     * Get High Value.
     * @return high value.
     */
    public double getHigh() {
        return high;
    }


    /**
     * Get Low Value.
     * @return low value.
     */
    public double getLow() {
        return low;
    }


    /**
     * Get Close Value.
     * @return close value.
     */
    public double getClose() {
        return close;
    }
}
