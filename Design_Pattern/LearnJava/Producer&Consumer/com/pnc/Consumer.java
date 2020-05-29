package com.pnc;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class Consumer extends Thread {
    @Override
    public void run()
    {
        int item;
        while (true) {
            try {
                Main.full.down();
                item=remove_item(Main.buffer);
                Main.empty.up();
                consume_item(item);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    int remove_item(Stack<Integer> buffer) throws InterruptedException {
        synchronized (buffer) {
            System.out.println("Consume!");
//            Main.full.down();
//            Main.empty.up();
//            System.out.println("Take out: "+buffer.peek());
            return buffer.pop();
        }
    }

    void consume_item(int item) throws InterruptedException {
//        sleep(3000);

    }

}