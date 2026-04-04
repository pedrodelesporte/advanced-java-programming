package javaclasslabs.domain.test;

import javaclasslabs.domain.StockClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class stockWriter {
        private final File file;
        private final ArrayList<StockClass> stockList;

        /**
         * Constructor.
         *
         * @param file        File.
         * @param productList Product List.
         */
        public stockWriter(File file, ArrayList<StockClass> productList) {
            this.file = file;
            this.stockList = productList;
        }

        public void write() throws IOException {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutStream = new ObjectOutputStream(fileOutputStream);

            objectOutStream.writeObject(stockList);

            objectOutStream.close();
        }

        public static void main(String[] args) throws IOException {
            File file = new File("stockTest.txt");
            StockClass stockClass = new StockClass("test", 1.0, 2.0, 3.0);

            ArrayList<StockClass> stockList = new ArrayList<>();
            stockList.add(stockClass);

            stockWriter writer = new stockWriter(file, stockList);

            writer.write();

        }
    }

