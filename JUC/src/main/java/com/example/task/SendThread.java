package com.example.task;

import java.util.List;
import java.util.Random;


/**
 * 思考做锁的方式
 * 锁一定要唯一，对于这有两个认为线程唯一的就是礼物对象
 * 锁（礼物）
 */
public class SendThread extends Thread {

    List<String> gift;
    int count;
    public SendThread(List<String> gift, String name) {
        super(name);
        this.gift = gift;
    }

    @Override
    public void run() {
        //小明，小红发礼物
        //实现线程安全问题
        Random rd = new Random();
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (gift) {
                if (gift.size() < 10) {
                    break;
                }
                String re = gift.remove(rd.nextInt(gift.size()));
                System.out.println(name + "发出去了" + re);
                count++;
            }
        }

    }
    public int getCount(){
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
