package com.whq.designpattern.templatemethod;

/**
 * @Description: 茶叶类
 * @Author: whq
 * @Date: 2021/8/22 22:05
 */
public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("用煮沸浸泡茶叶");
    }

    @Override
    protected void addCondiments() {
        System.out.println("茶叶加柠檬");
    }
}
