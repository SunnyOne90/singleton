package com.gf.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
//注册器单利
public class Singleton4 {
    private static Map<String,Object> map = new ConcurrentHashMap<>();

    public static Object getInstance(String name){
        try {
            if(!map.containsKey(name)){
                map.put(name,Class.forName(name).newInstance());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return map.get(name);
    }

}
