package com.example.main;

import com.example.entity.Account;
import com.example.thread.GetMoney;

/**
 * 解决线程安全的方法：
 * 1.同步代码块synchronization(锁对象)
 * 2.
 */
public class GetMoneyMain {
    public static void main(String[] args) {
        //创建一个账户对象(同一个线程对象交给多个线程处理)
        Account account=new Account("00001",100000);

        new GetMoney(account,"小明").start();//小明
        new GetMoney(account,"小红").start();//小红

    }
}
