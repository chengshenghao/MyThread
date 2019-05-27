package com.tcsl.mythread;

/**
 * 描述:
 * <p/>作者：ss
 * <br/>创建时间：2019/5/27 14: 20
 */

public class MyThread extends Thread {
    private int ticket = 100;//一个窗口有100张票
    private String name; //窗口名, 也即是线程的名字

    public MyThread(String name) {
        this.name = name;
    }

    //在run方法里复写需要进行的操作:卖票速度是1s/张
    @Override
    public void run() {
        while (ticket > 0) {
            ticket--;
            System.out.println(name + "卖掉了1张票，剩余票数为:" + ticket);

            try {
                Thread.sleep(1000);//卖票速度是1s一张
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
