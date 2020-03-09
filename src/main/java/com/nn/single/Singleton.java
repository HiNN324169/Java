package com.nn.single;

public class Singleton {

    /**
     *  双重检索
     */

    private Singleton(){};
    private volatile static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class) {
                instance = new Singleton();
            }
            return instance;
        }
        return instance;
    }

}
