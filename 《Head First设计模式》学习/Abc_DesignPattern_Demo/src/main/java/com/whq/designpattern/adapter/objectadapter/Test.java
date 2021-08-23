package com.whq.designpattern.adapter.objectadapter;

import com.whq.designpattern.adapter.Duck;
import com.whq.designpattern.adapter.WildTurkey;

/**
 * @Description: 测试类
 * @Author: whq
 * @Date: 2021/8/23 9:37
 */
public class Test {
    public static void main(String[] args) {
        Duck duck = new WildTurkeyToDuckAdapter(new WildTurkey());
        duck.quack();
        duck.fly();
    }
}
