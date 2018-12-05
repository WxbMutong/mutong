package com.wxb.projectpractice.threaddevelopment;

/**
 * Created by 木桐 on 2018/9/11.
 */
public class Water {

    int num;
    public synchronized void flowWater(String name){
        synchronized (this){
            ++num;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("开始为"+name+"同学放水！");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束为"+name+"同学放水！");
            if (num<3){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                notifyAll();
            }
        }
    }

}
