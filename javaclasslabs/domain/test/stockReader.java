package javaclasslabs.domain.test;

import javaclasslabs.domain.StockClass;

import java.io.*;
import java.util.ArrayList;

public class stockReader {
    private ArrayList<StockClass> stockList;

    @SuppressWarnings("unchecked")
    public stockReader(File file) throws IOException, ClassNotFoundException {
        FileInputStream FileInputStream = new FileInputStream(file);
        ObjectInputStream ObjectInputStream = new ObjectInputStream(FileInputStream);

        stockList = (ArrayList<StockClass>) ObjectInputStream.readObject();

        ObjectInputStream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("stockList.raw");
        stockReader reader = new stockReader(file);
        ArrayList<StockClass> stockList = reader.getStockList();

        for (StockClass stockClass : stockList) {
            System.out.println(stockClass.TickerSymbol);
            System.out.println(stockClass.currentValue);
            System.out.println(stockClass.valueChange);
            System.out.println(stockClass.valuePercentChange);

        }


    }

    public ArrayList<StockClass> getStockList() {
        return stockList;
    }
}


