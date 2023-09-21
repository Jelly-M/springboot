package com.example.main;

import com.example.thread.MyCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;


/**
 * 掌握线程的创建方式三，实现callable接口
 */
public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //3.创建一个callable 对象
       Callable<String> callable =new MyCallable(100);
       //4.把callable对象封装成一个futureTask对象（任务对象）
        //未来任务对象的作用？
        //1.是一个任务对象，实现了Runnable对象
        //2.可以在 线程执行完毕之后，用未来任务对象调用get方法获取线程执行完毕后的结果
        FutureTask<String> f1=new FutureTask<>(callable);
        //5.把任务对象交给一个thread对象
        new Thread(f1).start();
        //6.获取线程执行完毕后的结果
        //注意：如果执行到这里，假如上面的线程还没有执行完毕
        //这里的代码get()方法会进行暂停,等待上面的线程执行完毕后才会获取到结果。
//        Callable<String> callable2 =new MyCallable(200);
//        FutureTask<String> f2=new FutureTask<>(callable2);
//        new Thread(f2).start();
//        String s2 = f2.get();
//多个线程就会等待执行完毕
        String s = f1.get();
        System.out.println(s);
//        System.out.println(s2);

    }
}
