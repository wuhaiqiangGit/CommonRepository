package com.whq.designpattern.adapter.classadapter;

import com.whq.designpattern.adapter.Duck;

/**
 * @Description: 测试类
 * @Author: whq
 * @Date: 2021/8/23 9:33
 */
public class Test {
    public static void main(String[] args) {
        Duck duck = new WildTurkeyToDuckAdapter();
        duck.quack();
        duck.fly();
    }
}
