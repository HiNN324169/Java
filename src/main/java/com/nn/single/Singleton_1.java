package com.nn.single;

public class Singleton_1 {

    /**
     *  懒汉型(线程不安全)
     */

    private Singleton_1(){}

    private static Singleton_1 instance;
    public static Singleton_1 getInstance(){
        if (instance == null){
            instance = new Singleton_1();
            return instance;
        }
        return instance;
    }

}
