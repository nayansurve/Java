package com.tap.aynchronus.demo;

public class multiThreadBank {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> serveCustomer("Customer 1"));
        Thread t2 = new Thread(() -> serveCustomer("Customer 2"));
        Thread t3 = new Thread(() -> serveCustomer("Customer 3"));

        t1.start();
        t2.start();
        t3.start();
    }

    static void serveCustomer(String name) {
        System.out.println(name + " service started by " + Thread.currentThread().getName());
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        System.out.println(name + " service finished by " + Thread.currentThread().getName());
    }
}