package com.tcsl.mythread;

/**
 * 描述:
 * <p/>作者：ss
 * <br/>创建时间：2019/5/27 15: 22
 */

public class MyThread1 implements Runnable {
    private int ticket = 100;//一个窗口有100张票
    @Override
    public void run() {
        while (ticket>0){
            ticket--;
            System.out.println(Thread.currentThread().getName() + "卖掉了1张票，剩余票数为:"+ticket);

            try {
                Thread.sleep(1000);//卖票速度是1s一张
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
