package com.gf.singleton;

public class Singleton {
    //饿汉式  天生线程安全，但比较浪费内存，在类加载时写入内存中
    private Singleton(){}
    private final static Singleton singleton  = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
}
