package com.example.task;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 乐观锁的实现
 */
public class LockTask2 implements Runnable{


    AtomicInteger atomicInteger=new AtomicInteger();
    @Override
    public void run() {
    String name=Thread.currentThread().getName();
        for (int i = 0; i <=99; i++) {
            System.out.println(name+"count===>"+atomicInteger.incrementAndGet());
        }
    }
}
