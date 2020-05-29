package com.company;
import java.time.LocalTime;

public class Daemon{
    public static void main(String[] args) {
        Thread t = new Thread(new TimerThread());
        t.setDaemon(true);//当JVM结束时，DAEMON负责结束此进程
        t.start();
    }
}
class TimerThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
