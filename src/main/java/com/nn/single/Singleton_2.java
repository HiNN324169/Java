package com.nn.single;

public class Singleton_2 {

    /**
     *  懒汉型（线程安全）
     */

    private Singleton_2(){}

    private static Singleton_2 instance;
    public synchronized static Singleton_2 getInstance(){
        if (instance == null){
            instance = new Singleton_2();
            return instance;
        }
        return instance;
    }
}
