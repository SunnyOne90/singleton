package com.gf.singleton.register;

public enum  SingletonEnum {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static SingletonEnum getInstance(){
        return INSTANCE;
    }
}
