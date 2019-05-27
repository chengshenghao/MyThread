package com.tcsl.mythread;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sale(View view) {
        MyThread myThread = new MyThread("窗口1");
        MyThread myThread2 = new MyThread("窗口2");
        myThread.start();
        myThread2.start();
    }

    public void sale1(View view) {
        //步骤2:创建线程类的实例
        //创建二个线程，模拟二个窗口卖票
        MyThread1 mt1 = new MyThread1();

        Thread mt11 = new Thread(mt1, "窗口1");
        Thread mt22 = new Thread(mt1, "窗口2");

        //步骤3：调用start()方法开启线程
        //启动二个线程，也即是窗口，开始卖票
        mt11.start();
        mt22.start();
    }
}
