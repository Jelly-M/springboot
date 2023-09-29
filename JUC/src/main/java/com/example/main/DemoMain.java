package com.example.main;

import com.example.entity.Student;
import com.example.task.SendThread;

import java.util.*;

/**
 * 练习多线程
 */
public class DemoMain {
    public static void main(String[] args) throws InterruptedException {
        //需求描述：有100份礼品，小红，小明两个人同时发送，当剩下的礼品数小于10份的时候则不在送出，
        // 利用多线程模拟该过程并将线程的名称打印出来。并最后在控制台商分别打印出小红，小明各自送出多少分礼物。
        //目标：掌握多线程的基本使用


/*        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("蜘蛛精", 26, 172.5);
        Student s3 = new Student("紫霞", 23, 167.6);
        Student s4 = new Student("白晶晶", 25, 169.0);
        Student s5 = new Student("牛魔王", 35, 183.3);
        Student s6 = new Student("牛夫人", 34, 168.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);
        Student[] arr = students.stream().filter(a -> a.getHeight() > 170).toArray(len -> new Student[len]);
        System.out.println(Arrays.toString(arr));*/


        //定义礼物
        List<String> gift = new ArrayList<>();
        String[] name = new String[]{"口红", "包包", "鲜花", "剃须刀", "皮带"};
        Random rd = new Random();
        for (int i = 0; i < 100; i++) {
            gift.add(name[rd.nextInt(name.length)] + (i + 1));
        }

        SendThread xm = new SendThread(gift, "小明");
        xm.start();
        SendThread xh = new SendThread(gift, "小红");
        xh.start();
        //主线程等子线程执行完毕
        xm.join();
        xh.join();
        System.out.println(xm.getCount());
        System.out.println(xh.getCount());
    }

}
