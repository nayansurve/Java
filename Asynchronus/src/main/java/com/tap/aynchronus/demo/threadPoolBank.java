package com.tap.aynchronus.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadPoolBank {

    static void serveCustomer(String name) {
        System.out.println(name + " served by " + Thread.currentThread().getName());
        try 
          { 
            Thread.sleep(2000); 
            } 
          catch (InterruptedException e) {

          }
        }
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 20; i++) {
            final String customer = "Customer " + i;
            service.submit(() -> serveCustomer(customer));//Gives the task to the thread pool.
        }

        service.shutdown(); //No more new tasks. Finish the ones in the queue, then stop.”
    }

    
}