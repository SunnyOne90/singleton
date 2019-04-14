package com.gf.singleton.lazy;

import com.gf.singleton.hungry.SingletonHungry;

/**
 * 在使用的时候才会创建实例,缺点是因为增加了锁，执行效率低
 */
public class SingletonLazy {

    private SingletonLazy(){}
    private volatile static SingletonLazy singleton = null;

    public static SingletonLazy getInstance(){
        if(singleton == null){
            synchronized(SingletonLazy.class) {
                if(singleton == null) {
                    singleton = new SingletonLazy();
                }
            }
        }
        return singleton;
    }
}
