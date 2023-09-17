package com.example.main;

/**
 * 使用匿名内部类的形式
 */
public class RunnableInnerClass {
    public static void main(String[] args) {
        //1.直接使用runnable接口的匿名内部类的形式创建任务对象
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    System.out.println("子线程1输出："+i);
                }
            }
        };
        new Thread(runnable).start();
        //简化形式1
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 7; i++) {
                    System.out.println("子线程2输出："+i);
                }
            }
        }).start();
        //简化形式2 lambda
        new Thread(()->{
                for (int i = 0; i < 8; i++) {
                    System.out.println("子线程3输出："+i);
                }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程main输出："+i);
        }
    }
}
