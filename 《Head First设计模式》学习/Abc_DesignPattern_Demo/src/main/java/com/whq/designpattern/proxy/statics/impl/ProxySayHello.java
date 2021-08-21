package com.whq.designpattern.proxy.statics.impl;

import com.whq.designpattern.proxy.statics.SayHello;

/**
 * @Description: 静态代理实现类
 * @Author: whq
 * @Date: 2021/8/21 16:45
 */
public class ProxySayHello implements SayHello {

    private final SayHello sayHello;

    public ProxySayHello(SayHello sayHello) {
        this.sayHello = sayHello;
    }

    @Override
    public void sayHello() {
        System.out.println("静态代理之前执行--");
        sayHello.sayHello();
        System.out.println("静态代理之后执行--");
    }
}
