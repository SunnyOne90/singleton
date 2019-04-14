package com.gf.singleton.hungry;

/**
 * 在类加载时被初始化，天生线程安全，缺点是浪费内存，用或不用都在内存中
 */
public class SingletonHungry {

    private SingletonHungry(){}

    private static final SingletonHungry singleton = new SingletonHungry();

    public static SingletonHungry getInstance(){
        return singleton;
    }
}
