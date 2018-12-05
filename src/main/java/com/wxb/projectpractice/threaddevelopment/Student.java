package com.wxb.projectpractice.threaddevelopment;

/**
 * Created by 木桐 on 2018/9/11.
 */
public class Student extends Thread {

    private String name;
    private Water water;

    public Student(String name,Water water){
        super();
        this.name = name;
        this.water = water;
    }

    public synchronized void receiveWater(){
        System.out.println(name+"同学，从教室奔向水房！");
        water.flowWater(name);
        System.out.println(name+"同学，从水房回到教室！");
    }

    @Override
    public void run(){
        receiveWater();
    }
}
