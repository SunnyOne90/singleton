package com.gf.singleton.lazy;

public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        System.out.println("访问构造方法");
        if(SingletonCreate.singleton != null){
            throw new RuntimeException("有人尝试通过反射入侵创建");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        System.out.println("进入getInstance");
        LazyInnerClassSingleton singleton = SingletonCreate.singleton;
        return singleton;
    }
    private static class SingletonCreate{
        private SingletonCreate(){
            System.out.println("SingletonCreate");
        }
        private static final LazyInnerClassSingleton singleton = new LazyInnerClassSingleton();
    }

}
