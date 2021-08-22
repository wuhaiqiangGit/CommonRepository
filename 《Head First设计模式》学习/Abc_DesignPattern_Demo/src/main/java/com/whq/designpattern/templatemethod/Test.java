package com.whq.designpattern.templatemethod;

/**
 * @Description: 测试类
 * @Author: whq
 * @Date: 2021/8/22 18:41
 */
public class Test {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("-------------");
        Beverage tea = new Tea();
        tea.prepareRecipe();
    }
}
