package javaclasslabs.domain;

public class StockPortfolio {
    private String tickerSymbol;
    private double currentPrice;
    private int numSharesOwned;

    public StockPortfolio(String tickerSymbol, double currentPrice) {
        this.tickerSymbol = tickerSymbol;
        this.currentPrice = currentPrice;
    }


    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;

    }


    public int buyShares(int numSharesToBuy) {
      this.numSharesOwned += numSharesToBuy;
      return numSharesToBuy;
    }

    public int sellShares(int numSharesToSell) {
        this.numSharesOwned -= numSharesToSell;
        return numSharesOwned;
    }

    public void getTotalValue(){
        System.out.println(this.numSharesOwned * this.currentPrice);

    }
}
