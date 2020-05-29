package com.pnc;

import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static int consumer_num=10;
    public static int producer_num=10;
    public static int buffer_size=10;

    public static Stack<Integer> buffer=new Stack<Integer>();
    public static Semaphore empty=new Semaphore(buffer_size);
    public static Semaphore full=new Semaphore(0);

    public static void main(String args[])
    {
        ExecutorService consumerPool= Executors.newFixedThreadPool(consumer_num);
        ExecutorService producerPool= Executors.newFixedThreadPool(producer_num);
        for (int i=0;i<producer_num;i++) {
            producerPool.submit(new Producer());
        }
        for (int i=0;i<consumer_num;i++) {
            consumerPool.submit(new Consumer());
        }

    }
}

