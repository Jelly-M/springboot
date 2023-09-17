package com.example.main;

import com.example.thread.MyThread;

public class ThreadMain {
    //main 是有默认主线程实现的
    public static void main(String[] args) {
        //3.创建MyThread的对象代表一个线程
        Thread myThread=new MyThread();
        //4.启动一个线程
        myThread.start();

        for (int i = 1; i <=5 ; i++) {
            System.out.println("主线程main输出"+i);
        }
    }
}
