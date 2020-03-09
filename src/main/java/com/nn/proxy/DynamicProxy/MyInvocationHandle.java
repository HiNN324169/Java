package com.nn.proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandle implements InvocationHandler {

    private Object target;
    public void setTarget(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        StarSkill.skill1();
        method.invoke(target,args);
        StarSkill.skill2();
        return null;
    }
}
