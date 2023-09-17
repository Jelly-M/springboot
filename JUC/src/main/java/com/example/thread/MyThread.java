package com.example.thread;

/**
 * 1.让子类继承Thread
 */
public class MyThread extends Thread{
    //2.重新thread run 方法
    @Override
    public void run() {
        //描述线程的执行任务
        for (int i = 1; i <=5 ; i++) {
            System.out.println("子线程MyThread 线程输出"+i);
        }
    }
}
