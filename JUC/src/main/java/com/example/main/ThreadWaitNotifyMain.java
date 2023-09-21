package com.example.main;

import com.example.task.DeskTask;

/**
 * 线程通信，唤醒别人，等待自己
 * 共享数据
 */
public class ThreadWaitNotifyMain {
    //   需求：3个生产者线程，负责生产包子，每个线程每次只能生产1个包子放在桌子上
    //      2个消费者线程负责吃包子，每人每次只能从桌子上拿1个包子吃。
    public static void main(String[] args) {
        DeskTask deskTask=new DeskTask();
        //创建三个厨师，放包子
        new Thread(()->{
            while (true) {
                deskTask.set();
            }
        },"厨师1").start();
        new Thread(()->{
            while (true) {
                deskTask.set();
            }
        },"厨师2").start();
        new Thread(()->{
            while (true) {
                deskTask.set();
            }
        },"厨师3").start();
        //2个顾客拿包子
        new Thread(()->{
            while (true) {
                deskTask.get();
            }
        },"顾客1").start();
        new Thread(()->{
            while (true) {
                deskTask.get();
            }
        },"顾客2").start();
    }
}
