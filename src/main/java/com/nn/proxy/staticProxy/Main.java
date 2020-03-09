package com.nn.proxy.staticProxy;

public class Main {

    public static void main(String[] args) {
        LDHStarProxy ldhStarProxy = new LDHStarProxy(new LDHStar());
        ldhStarProxy.sing();
        ldhStarProxy.dance();
    }
}
