package com.gf.singleton;

public class Singleton3 {
    //内部类是在方法调用之前初始化，解决内存，又避开了线程安全问题
    private static boolean flag = false;

    private Singleton3(){
        synchronized(Singleton3.class){
            if(false == flag){
                flag = !flag;
            }else {
                throw new RuntimeException("类被侵入");
            }
        }
    }
    public static final Singleton3 getInstance(){
        return CreateSingleton3.singleton;
    }
    private static class CreateSingleton3{
        private static  final  Singleton3 singleton = new Singleton3();
    }
}
