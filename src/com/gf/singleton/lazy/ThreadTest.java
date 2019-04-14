package com.gf.singleton.lazy;

public class ThreadTest {
    public static void main(String[] args) {
       Thread thread1 = new Thread(new ThreadSingleton());
       Thread thread2 = new Thread(new ThreadSingleton());

       thread1.start();
       thread2.start();
       System.out.println("主线程执行结束");
    }

}
