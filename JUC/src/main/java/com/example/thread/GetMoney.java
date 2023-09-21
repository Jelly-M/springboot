package com.example.thread;

import com.example.entity.Account;
import lombok.AllArgsConstructor;

/**
 * 创建取钱任务类
 */
public class GetMoney extends Thread{

    private final Account account;

    public GetMoney(Account account, String threadName){
        super(threadName);
        this.account=account;
    }
    @Override
    public void run() {
        //取钱任务
        account.DrawMoney(100000L);
    }
}
