package com.whq.designpattern.proxy.dynamic.jdk.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
 * @Description: 动态代理invocation 
 * @Author: whq
 * @Date: 2021/8/21 21:24
 */
public class InvocationHandlerProxy implements InvocationHandler {
    
    private Object target;

    public InvocationHandlerProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置工作");
        Object result = method.invoke(target,args);
        System.out.println("后置工作");
        return result;
    }
    
    /** 
     * @Description: 获取动态代理对象 
     * @Author: whq
     * @Date: 2021/8/21 21:52
     */
    public static <T> T getProxyInstance(Object target){
        InvocationHandlerProxy invocationHandlerProxy = new InvocationHandlerProxy(target);
        Class<?> targetClass = target.getClass();
        return (T) Proxy.newProxyInstance(targetClass.getClassLoader(),targetClass.getInterfaces(),invocationHandlerProxy);
    }
}
