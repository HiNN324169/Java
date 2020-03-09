package com.nn.proxy.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 *  生产代理对象的工厂
 */
public class MyProxyFactory {

    public static Object getProxy(Object target){
        MyInvocationHandle myInvocationHandle = new MyInvocationHandle();
        myInvocationHandle.setTarget(target);
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), myInvocationHandle);
        return proxy;
    }
}
