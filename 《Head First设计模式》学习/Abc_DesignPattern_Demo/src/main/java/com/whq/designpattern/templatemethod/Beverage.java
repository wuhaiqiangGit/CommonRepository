package com.whq.designpattern.templatemethod;

/**
 * @Description: 饮料类，抽象类
 * @Author: whq
 * @Date: 2021/8/22 18:33
 */
public abstract class Beverage {

    /**
     * @Description: 制作饮料的模板方法
     * @Author: whq
     * @Date: 2021/8/22 18:34
     */
    public final void prepareRecipe(){
        //前置钩子方法
        preHandle();
        //1.烧开水
        boilWater();
        //2.冲泡
        brew();
        //3.将原材料倒进杯子
        pourInCup();
        //4.添加附属品
        addCondiments();

        if (shouldDoSomething()){
            doSomething();
        }
        //后置钩子方法
        postHandle();
    }

    protected void preHandle(){
        // nothing
    }

    protected void postHandle(){
        // nothing
    }

    protected void doSomething(){
        System.out.println("doSomething");
    }

    protected boolean shouldDoSomething(){
        return false;
    }

    //烧水
    protected void boilWater(){
        System.out.println("第一步把水烧开");
    }

    //倒进杯子
    protected void pourInCup(){
        System.out.println("将原材料倒进杯子");
    }

    //冲泡
    protected abstract void brew();

    //添加附加品
    protected abstract void addCondiments();
}
