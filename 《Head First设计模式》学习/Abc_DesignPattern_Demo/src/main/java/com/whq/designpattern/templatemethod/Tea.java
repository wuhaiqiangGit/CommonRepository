package com.whq.designpattern.templatemethod;

/** 
 * @Description: 茶叶 
 * @Author: whq
 * @Date: 2021/8/22 20:59
 */
public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("用煮沸浸泡茶叶");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加柠檬");
    }
}
