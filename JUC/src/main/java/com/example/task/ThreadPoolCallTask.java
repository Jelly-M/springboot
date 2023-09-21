package com.example.task;

import java.util.concurrent.Callable;

public class ThreadPoolCallTask implements Callable<String> {
    private int n;
    public ThreadPoolCallTask(int n) {
        this.n=n;
    }
    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=i;

        }
        return Thread.currentThread().getName()+"线程求出了1-"+n+"的和"+sum;
    }
}
