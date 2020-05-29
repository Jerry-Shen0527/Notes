package com.pnc;

class Semaphore {

    Semaphore(int i){s =i;sleep_count=0;}

    int s;

    public int sleep_count=0;

    public synchronized void down() throws InterruptedException//通过synchronized使down成为原子操作，可能会损失一定的性能，但是没有方法封装了sleep
    {
        System.out.println("Down::Full:"+Main.full.s+" Buffer size: "+Main.buffer.size()+" ,Empty: "+Main.empty.s+" Consumer Awake: "+(Main.consumer_num-Main.full.sleep_count)+" Producer Awake: "+(Main.producer_num-Main.empty.sleep_count));
//        System.out.println("One down");
        if (s > 0) {
//            System.out.println(s);
            s--;
        }
        else {
//            System.out.println(s+" "+sleep_count);
            sleep_count++;
            wait();
        }
    }

    public synchronized void up() {
        System.out.println("Up  ::Full:"+Main.full.s+" Buffer size: "+Main.buffer.size()+" ,Empty: "+Main.empty.s+" Consumer Awake: "+(Main.consumer_num-Main.full.sleep_count)+" Producer Awake: "+(Main.producer_num-Main.empty.sleep_count));
        if (s == 0 && sleep_count > 0) {
//            System.out.println("Wake up!");
            sleep_count--;
            notify();
        }
        else if (s == 0 && sleep_count == 0) {
//            System.out.println("Added!");
            s++;
        }
        else if (s>0)
        {
//            System.out.println("Added!");
            s++;
        }
    }

}