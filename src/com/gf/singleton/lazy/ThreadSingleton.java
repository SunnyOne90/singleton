package com.gf.singleton.lazy;

import java.io.ObjectInputStream;

public class ThreadSingleton implements Runnable{
    @Override
    public void run() {
        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}
