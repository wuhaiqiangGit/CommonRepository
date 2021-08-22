package com.whq.designpattern.templatemethod;

/**
 * @Description: 咖啡类
 * @Author: whq
 * @Date: 2021/8/22 22:04
 */
public class Coffee extends Beverage {

    @Override
    protected boolean shouldDoSomething() {
        return true;
    }

    @Override
    protected void brew() {
        System.out.println("用煮沸冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("咖啡加牛奶和糖");
    }
}
