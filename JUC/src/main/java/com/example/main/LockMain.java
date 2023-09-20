package com.example.main;

import com.example.task.GetMoneyTask;
import com.example.task.GetMoneyThread;


public class LockMain {
    public static void main(String[] args) {
        GetMoneyTask account=new GetMoneyTask("1111",100000L);

        new GetMoneyThread(account,"小明").start();//小明
        new GetMoneyThread(account,"小红").start();//小红
    }
}
