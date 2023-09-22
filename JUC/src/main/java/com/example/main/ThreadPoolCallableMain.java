package com.example.main;

import com.example.task.ThreadPoolCallTask;
import org.apache.tomcat.util.threads.ThreadPoolExecutor;

import java.util.concurrent.*;

/**
 * 学习使用callable接口用线程池实现
 */
public class ThreadPoolCallableMain {
    public static void main(String[] args) {
        //通过ThreadPoolExecutor 创建一个线程池对象
        ExecutorService threadService = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS, new ArrayBlockingQueue<>(4)
                , new ThreadPoolExecutor.AbortPolicy());

        Future<String> submit1 = threadService.submit(new ThreadPoolCallTask(100));
        Future<String> submit2 = threadService.submit(new ThreadPoolCallTask(200));
        Future<String> submit3 = threadService.submit(new ThreadPoolCallTask(300));

        Future<String> submit4 = threadService.submit(new ThreadPoolCallTask(400));
        Future<String> submit5 = threadService.submit(new ThreadPoolCallTask(400));
        Future<String> submit6 = threadService.submit(new ThreadPoolCallTask(400));
        Future<String> submit7 = threadService.submit(new ThreadPoolCallTask(400));
        //创建的临时线程处理任务
        Future<String> submit8 = threadService.submit(new ThreadPoolCallTask(400));

        try {
            System.out.println(submit1.get());
            System.out.println(submit2.get());
            System.out.println(submit3.get());
            System.out.println(submit4.get());
            System.out.println(submit5.get());
            System.out.println(submit6.get());
            System.out.println(submit7.get());
            System.out.println(submit8.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
