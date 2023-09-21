package com.example.task;

/**
 * 线程池对象
 */
public class ThreadPoolTask implements Runnable {
    @Override
    public void run() {
        try {
            String name=Thread.currentThread().getName();
            System.out.println(name+"===开始打印了");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
