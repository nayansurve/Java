package com.tap.aynchronus.demo;

public class singleThreadBank {
    public static void main(String[] args) {
        serveCustomer("Customer 1");
        serveCustomer("Customer 2");
        serveCustomer("Customer 3");
    }

    static void serveCustomer(String name) {
        System.out.println(name + " service started...");
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        System.out.println(name + " service finished!");
    }
}