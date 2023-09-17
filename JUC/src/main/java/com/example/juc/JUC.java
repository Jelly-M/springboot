package com.example.juc;

import java.util.concurrent.atomic.AtomicInteger;

public class JUC {
    public static void main(String[] args) throws InterruptedException {
        //Thread thread=new MyThread();
//        Thread thread=new Thread(new MyRunnable());
//        thread.start();//启用一个新线程

//        Thread t = new MyThread();
//        t.start();
//        Thread.sleep(1); // 暂停1毫秒
//        t.interrupt(); // 中断t线程
//        t.join(); // 等待t线程结束
//        System.out.println("end");
        Thread add = new AddThread();
        Thread dec = new DecThread();
        add.start();
        dec.start();
        add.join();
        dec.join();
        System.out.println(Counter.count);
    }
}

class Counter {
    public static int count = 0;
    public static final AtomicInteger atomicInteger=new AtomicInteger(0);
}

class AddThread extends Thread {
    public void run() {
        for (int i=0; i<10000; i++) { Counter.atomicInteger.set(1); }
    }
}

class DecThread extends Thread {
    public void run() {
        for (int i=0; i<10000; i++) { Counter.atomicInteger.set(-1); }
    }
}

class MyThread extends Thread{
    public void run() {
        int n = 0;
        while (! isInterrupted()) {
            n ++;
            System.out.println(n + " hello!");
        }
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("MyRunnable");
    }
}
