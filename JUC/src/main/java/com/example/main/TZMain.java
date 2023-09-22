package com.example.main;

import com.example.task.LockTask;
import com.example.task.LockTask2;

public class TZMain {
    public static void main(String[] args) {
        //拓展悲观锁，乐观锁
        //悲观锁：一上来就加锁，没有安全感。每次只能一个线程进入访问完毕后，在解锁。线程安全，性能较差
        //乐观锁：一开始不上锁，认为是没有问题的，大家一起跑，等要出现线程安全的时候才开始控制。线程安全，性能较好。

        //悲观锁的实现
/*        Runnable runnable=new LockTask();

        for (int i = 0; i <=99 ; i++) {
            new Thread(runnable).start();
        }*/

        //乐观锁的实现（AtomicInteger）

        Runnable runnable1=new LockTask2();
        for (int i = 0; i <=99 ; i++) {
            new Thread(runnable1).start();
        }
    }
}
