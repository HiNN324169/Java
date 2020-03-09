package com.nn.single;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        test1();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                test1();
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 1000; i++) {
            executorService.submit(runnable);
        }
    }

    private static void test1() {
        Singleton_1 instance = Singleton_1.getInstance();
        Singleton_1 instance2 = Singleton_1.getInstance();
        Singleton_1 instance3 = Singleton_1.getInstance();
        System.out.println(instance);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println("==========================Singleton_1==========================================");
        Singleton_2 instance5 = Singleton_2.getInstance();
        Singleton_2 instance6 = Singleton_2.getInstance();
        Singleton_2 instance7 = Singleton_2.getInstance();
        System.out.println(instance5);
        System.out.println(instance6);
        System.out.println(instance7);
        System.out.println("=================================================Singleton_2===================");

        Singleton singleton = Singleton.getInstance();
        Singleton singleton11 = Singleton.getInstance();
        Singleton singleton111 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton11);
        System.out.println(singleton111);
        System.out.println("=================================================Singleton===================");

        Singleton_3 instance1 = Singleton_3.getInstance();
        Singleton_3 instance0 = Singleton_3.getInstance();
        Singleton_3 instance00= Singleton_3.getInstance();

        System.out.println(instance1);
        System.out.println(instance0);
        System.out.println(instance00);
        System.out.println("=================================================Singleton_3===================");

        Singleton_4 instance4 = Singleton_4.INSTANCE;
        Singleton_4 instance44 = Singleton_4.INSTANCE;
        Singleton_4 instance444= Singleton_4.INSTANCE;
        System.out.println(instance4);
        System.out.println(instance444);
        System.out.println(instance44);
        System.out.println("=================================================枚举类===================");

    }
}
