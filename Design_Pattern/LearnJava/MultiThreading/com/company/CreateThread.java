package com.company;

//第一种方法通过子类继承来实现

 public class CreateThread {
     public static void main(String[] args) {
         Thread t = new MyThread();
         t.start(); // 启动新线程
     }
 }


// class MyThread extends Thread {
//     @Override
//     public void run() {
//         System.out.println("start new thread!");
//     }
// }


//第二种方法通过向Thread传递参数来实现，被传参数和第一种方法没有什么区别

// public class Main {
//     public static void main(String[] args) {
//         Thread t = new Thread(new MyRunnable());
//         t.start(); // 启动新线程
//     }
// }
//
// class MyRunnable implements Runnable {
//     @Override
//     public void run() {
//         System.out.println("start new thread!");
//     }
// }


// 可通过lambda表达式来简化语法

//public class Main {
//    public static void main(String[] args) {
//        Thread t = new Thread(() -> {
//            System.out.println("start new thread!");
//        });
//        t.start(); // 启动新线程
//    }
//}
