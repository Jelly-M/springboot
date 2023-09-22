package com.example.task;

/**
 * 测试悲观锁，乐观锁的任务类
 */
public class LockTask implements Runnable{
    private int count=0;
    @Override
    public void run() {
        for (int i = 0; i <= 99; i++) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName()+"count===>"+(++count));
            }
        }
    }
}
