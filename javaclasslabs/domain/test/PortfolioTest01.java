package javaclasslabs.domain.test;

import javaclasslabs.domain.StockPortfolio;

public class PortfolioTest01 {
    public static void main(String[] args) {
        StockPortfolio stockPortfolio = new StockPortfolio("MSFT", 239.39);
        stockPortfolio.buyShares(100);
        stockPortfolio.getTotalValue();
        stockPortfolio.buyShares(100);
        stockPortfolio.getTotalValue();
        stockPortfolio.sellShares(50);
        stockPortfolio.getTotalValue();
    }
}
