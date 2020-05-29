package com.company;
public class MultiThread {
    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t = new Thread(() -> {
            System.out.println("thread run...");
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {}
            System.out.println("thread end.");
        });
        t.start();
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {}
        System.out.println("main end...");
    }
}
