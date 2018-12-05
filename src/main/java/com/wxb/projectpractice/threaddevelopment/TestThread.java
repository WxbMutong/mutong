package com.wxb.projectpractice.threaddevelopment;

/**
 * Created by 木桐 on 2018/9/11.
 */
public class TestThread {

    public static void main(String[] args){
        noqueue();
    }

    static void noqueue(){
        Water water = new Water();
        Student wxb = new Student("wxb",water);
        Student syj = new Student("syj",water);
        Student cjp = new Student("cjp",water);
        wxb.start();
        syj.start();
        cjp.start();
    }

}
