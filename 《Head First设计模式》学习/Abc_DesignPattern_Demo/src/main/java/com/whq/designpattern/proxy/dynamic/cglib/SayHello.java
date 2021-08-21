package com.whq.designpattern.proxy.dynamic.cglib;

/**
 * @Description: sayhello类
 * @Author: whq
 * @Date: 2021/8/21 21:52
 */
public class SayHello {
    public void sayHello(){
        System.out.println("say hello");
    }

    /** 
     * @Description: cglib final方法不代理 
     * @Author: whq
     * @Date: 2021/8/21 22:02
     */
    public final void sayHi(){
        System.out.println("say hi");
    }
}
