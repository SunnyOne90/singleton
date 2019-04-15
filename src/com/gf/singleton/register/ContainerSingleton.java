package com.gf.singleton.register;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private ContainerSingleton(){}
    private static Map<String,Object> map = new ConcurrentHashMap<>();

    public static Object getInstance(String className){
        synchronized (map){
            Object obj = null;
            if(!map.containsKey(className)){
                try {
                    obj = Class.forName(className).newInstance();
                    map.put(className,obj);
                }catch (Exception e){
                    e.printStackTrace();
                }
               return obj;
            }
            return map.get(className);
        }
    }
}
