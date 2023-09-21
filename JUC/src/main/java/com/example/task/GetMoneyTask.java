package com.example.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetMoneyTask {
    private String cardId;
    private double money;
    private final Lock lock=new ReentrantLock();

    public void DrawMoney(long l) {
        String name = Thread.currentThread().getName();
        try {
            lock.lock();
            if(this.money>=l){
                System.out.println(name+"来取钱了");
                this.money-=l;
                System.out.println(name+"取钱完毕，卡中余额还有"+this.money);
            }
            else{
                System.out.println("余额不足");
            }
        } finally {
            lock.unlock();
        }

    }
}
