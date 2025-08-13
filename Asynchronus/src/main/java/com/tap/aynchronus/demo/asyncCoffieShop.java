package com.tap.aynchronus.demo;

import java.util.concurrent.CompletableFuture;

public class asyncCoffieShop {

    public static void main(String[] args) {
        System.out.println("Order is placaed for coffie ");
        CompletableFuture<String> coffie = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
             
            } catch (Exception e) {
                System.out.println(e);
            }
               return "your coffie is ready";
        // System.out.println("Your Coffie is ready");
        });
        System.out.println("you keep chatting with your friends ");
        String result = coffie.join();
        System.out.println(result);
        System.out.println("Enjoy your coffie");
    }
}
