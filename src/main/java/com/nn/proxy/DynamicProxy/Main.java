package com.nn.proxy.DynamicProxy;

public class Main {

    public static void main(String[] args) {
        Star star = new LDHStar();
        Star proxy = (Star) MyProxyFactory.getProxy(star);
        proxy.ad();
    }
}
