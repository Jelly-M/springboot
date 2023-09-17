package com.example.main;

import com.example.thread.MyRunnable;

public class RunnableMain {
    public static void main(String[] args) {
        //创建一个任务类对象
        Runnable target=new MyRunnable();
        //创建线程对象并启动
        new Thread(target).start();

        //用于主线程输出
        for (int i = 1; i <=5 ; i++) {
            System.out.println("主线程MyThread 线程输出"+i);
        }
    }
}
