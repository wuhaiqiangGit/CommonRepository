package com.whq.designpattern.proxy.dynamic.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description: cglib methodInterceptor
 * @Author: whq
 * @Date: 2021/8/21 21:54
 */
public class MethodInterceptorProxy implements MethodInterceptor {

    private MethodInterceptorProxy(){}

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置操作");
        Object result = methodProxy.invokeSuper(proxy, args);
        System.out.println("后置操作");
        return result;
    }

    public static <T> T getProxyInstance(Class<T> target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target);
        enhancer.setCallback(new MethodInterceptorProxy());
        return (T) enhancer.create();
    }
}
