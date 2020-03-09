package com.nn.proxy.staticProxy;

/**
 *  真实对象：刘德华明星
 */
public class LDHStar implements Star{

    @Override
    public void sing() {
        System.out.println("给我一杯忘情水。。。");
    }
}
