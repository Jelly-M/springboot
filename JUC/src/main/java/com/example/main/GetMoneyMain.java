package com.example.main;

import com.example.entity.Account;
import com.example.thread.GetMoney;

public class GetMoneyMain {
    public static void main(String[] args) {
        //创建一个账户对象
        Account account=new Account("00001",100000);

        new GetMoney(account,"小明").start();//小明
        new GetMoney(account,"小红").start();//小红

    }
}
