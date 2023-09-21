package com.example.task;

import java.util.ArrayList;
import java.util.List;

/**
 * 桌子类，桌子上有包子，厨师做包子，顾客吃包子
 */
public class DeskTask {
    private List<String> foot=new ArrayList<>();

    public synchronized void get(){
        String name = Thread.currentThread().getName();
        try {
            if(foot.size()>0){
                System.out.println(name+"拿走了一个包子["+foot.get(0)+"]");
                foot.clear();

                Thread.sleep(1000);
                //唤醒别人，等待自己
                this.notify();
                this.wait();
            }
            else{
                //已经有包子了，不需要做了唤醒别人等待自己
                this.notify();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void set(){
        String name=Thread.currentThread().getName();
        try {
            if(foot.size()==0){
                foot.add("肉包子");
                System.out.println(name+"做了一个肉包子");

                Thread.sleep(1000);
                //包子做完了，唤醒别人等待自己
                this.notify();
                this.wait();
            }
            else{
                //已经有包子了，不需要做了
                //唤醒别人等待自己
                this.notify();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
