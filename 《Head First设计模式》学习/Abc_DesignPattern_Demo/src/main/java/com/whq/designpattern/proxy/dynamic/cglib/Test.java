package com.whq.designpattern.proxy.dynamic.cglib;

/**
 * @Description: 测试类
 * @Author: whq
 * @Date: 2021/8/21 21:58
 */
public class Test {
    public static void main(String[] args) {
        SayHello sayHello = new SayHello();
        SayHello proxy = MethodInterceptorProxy.getProxyInstance(sayHello.getClass());
        proxy.sayHello();
        proxy.sayHi();
    }
}
