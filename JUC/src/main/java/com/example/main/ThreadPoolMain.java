package com.example.main;

import com.example.task.ThreadPoolTask;
import com.sun.jmx.snmp.tasks.ThreadService;
import org.apache.tomcat.util.threads.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 线程池，线程池的创建
 */
public class ThreadPoolMain {
    public static void main(String[] args) {
        //通过ThreadPoolExecutor 创建一个线程池对象
        ExecutorService threadService = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS, new ArrayBlockingQueue<>(4)
                , new ThreadPoolExecutor.AbortPolicy());
        Runnable threadPoolTask=new ThreadPoolTask();

        threadService.execute(threadPoolTask);//线程池会自动创建一个线程，自动处理这个任务，自动执行
        threadService.execute(threadPoolTask);//线程池会自动创建一个线程，自动处理这个任务，自动执行
        threadService.execute(threadPoolTask);//线程池会自动创建一个线程，自动处理这个任务，自动执行
        //这里4个放队列 ，没有线程处理就放置到队列中排队
        threadService.execute(threadPoolTask);
        threadService.execute(threadPoolTask);
        threadService.execute(threadPoolTask);
        threadService.execute(threadPoolTask);

        //到了创建临时线程的时候了
        threadService.execute(threadPoolTask);
        threadService.execute(threadPoolTask);
        //到了使用拒绝策略的时机了
        threadService.execute(threadPoolTask);
    }


}
