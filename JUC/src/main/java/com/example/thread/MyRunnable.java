package com.example.thread;

/**
 * 创建一个任务类实现Runnable
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        //描述线程的执行任务
        for (int i = 1; i <=5 ; i++) {
            System.out.println("子线程MyThread 线程输出"+i);
        }
    }
}
