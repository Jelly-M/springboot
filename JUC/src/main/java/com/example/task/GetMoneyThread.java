package com.example.task;

import com.example.entity.Account;

public class GetMoneyThread extends Thread{
    private final GetMoneyTask account;
    public GetMoneyThread(GetMoneyTask account, String threadName){
        super(threadName);
        this.account=account;
    }
    @Override
    public void run() {
        //取钱任务
        account.DrawMoney(100000L);
    }
}
