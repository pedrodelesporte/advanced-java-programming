package javaclasslabs.domain.test;

import javaclasslabs.domain.TicketMaster;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TicketMasterTest01 {
    public static void main(String[] args) {
        TicketMaster tickets = new TicketMaster(100);

        Thread buyTicket = new Thread(tickets);

        ExecutorService test = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            test.execute(buyTicket);
        }

        test.shutdown();

        System.out.println(tickets.getNumTicketsToSell());
    }
}
