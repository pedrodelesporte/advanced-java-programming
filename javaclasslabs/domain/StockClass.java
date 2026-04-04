package javaclasslabs.domain;

import java.io.Serializable;

public class StockClass implements Serializable {
   public String TickerSymbol;
   public double currentValue;
   public double valueChange;
   public double valuePercentChange;

    public StockClass(String tickerSymbol, double currentValue, double valueChange, double valuePercentChange) {
        TickerSymbol = tickerSymbol;
        this.currentValue = currentValue;
        this.valueChange = valueChange;
        this.valuePercentChange = valuePercentChange;
    }
}
