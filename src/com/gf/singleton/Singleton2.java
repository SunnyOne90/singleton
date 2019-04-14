package com.gf.singleton;

public class Singleton2 {
    //懒汉式，使用时才会实例化，但线程不安全，多线程下会导致对象重复创建
    private static Singleton2 instance = null;

    public static Singleton2 getInstance(){
        if(instance == null){
            return new Singleton2();
        }
        return instance;
    }
}
