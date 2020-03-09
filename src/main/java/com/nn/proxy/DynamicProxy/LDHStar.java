package com.nn.proxy.DynamicProxy;

/**
 *  真实对象：刘德华明星
 */
public class LDHStar implements Star{

    @Override
    public void sing() {
        System.out.println("给我一杯忘情水。。。");
    }

    @Override
    public void ad() {
        System.out.println("ad......");
    }


}
