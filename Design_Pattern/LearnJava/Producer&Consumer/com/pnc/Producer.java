package com.pnc;

import java.util.Random;
import java.util.Stack;

public class Producer extends Thread {

    Random r =new Random();
    @Override
    public void run()
    {
        int item;
        while (true) {
            try {
                item = generate_item();
                Main.empty.down();
                insert_item(item,Main.buffer);
                Main.full.up();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void insert_item(int num, Stack<Integer> buffer) throws InterruptedException//对象锁，不会被remove抢走，相当于mutex的作用
    {
        synchronized (buffer)//由于获取的锁都是buffer的对象锁，因此就相当于有全局的mutex
        {
            System.out.println("Produce!");
//            Main.empty.down();
            buffer.push(num);
//            Main.full.up();
//            System.out.println(buffer.size());
        }
    }

    int generate_item() throws InterruptedException {
//        sleep(5000);
        int item = r.nextInt();
        return item;
    }
}
