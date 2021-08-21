package com.whq.designpattern.proxy.statics;

import com.whq.designpattern.proxy.statics.impl.ProxySayHello;
import com.whq.designpattern.proxy.statics.impl.SayHelloImpl;

/**
 * @Description: 静态代理测试
 * @Author: whq
 * @Date: 2021/8/21 16:47
 */
public class Test {
    public static void main(String[] args) {
        SayHello target = new SayHelloImpl();
        SayHello proxy = new ProxySayHello(target);
        proxy.sayHello();
    }
}
