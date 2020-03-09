package com.nn.proxy.staticProxy;

/**
 *  LDHStar 的代理（刘德华增强类）
 */
public class LDHStarProxy implements Star {

    private Star star;

    public LDHStarProxy() {
        super();
    }

    public LDHStarProxy(Star star) {
        super();
        this.star = star;
    }

    @Override
    public void sing() {
        System.out.println("唱歌前准备（方法 前置增强）");
        star.sing();
        System.out.println("善后工作（方法 后置增强）");
    }

    public void dance(){
        System.out.println("刘德华跳舞了。。。（对类的功能增强）");
    }
}
