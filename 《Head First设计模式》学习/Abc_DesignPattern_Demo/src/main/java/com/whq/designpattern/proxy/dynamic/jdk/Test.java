package com.whq.designpattern.proxy.dynamic.jdk;

import com.whq.designpattern.proxy.dynamic.jdk.impl.InvocationHandlerProxy;
import com.whq.designpattern.proxy.dynamic.jdk.impl.SayHelloImpl;

public class Test {
    public static void main(String[] args) {
        SayHello sayHello = new SayHelloImpl();
        SayHello proxy = InvocationHandlerProxy.getProxyInstance(sayHello);
        proxy.sayHello();
    }
}
