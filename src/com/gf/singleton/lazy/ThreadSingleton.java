package com.gf.singleton.lazy;

public class ThreadSingleton implements Runnable{
    @Override
    public void run() {
        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}
