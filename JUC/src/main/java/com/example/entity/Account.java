package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 账户类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;

    public void DrawMoney(long l) {
        String name = Thread.currentThread().getName();
        if(this.money>=l){
            System.out.println(name+"来取钱了");
            this.money-=l;
            System.out.println(name+"取钱完毕，卡中余额还有"+this.money);
        }
        else{
            System.out.println("余额不足");
        }

    }
}
