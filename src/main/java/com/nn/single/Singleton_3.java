package com.nn.single;

public class Singleton_3 {

    /**
     *  静态内部类
     */
    private static class SingletonHolder{
        private static final Singleton_3 INSTANCE = new Singleton_3();
    }
    private Singleton_3(){};

    public static final Singleton_3 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
