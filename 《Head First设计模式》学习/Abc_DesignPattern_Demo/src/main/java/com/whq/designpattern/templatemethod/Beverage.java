package com.whq.designpattern.templatemethod;

/**
 * @Description: 饮料模板方法类
 * @Author: whq
 * @Date: 2021/8/22 21:59
 */
public abstract class Beverage {

    public final void prepareRecipe() {

        //第一步:把水煮沸。
        boilWater();

        //第二步:冲泡。
        brew();

        //第三步:把饮料倒进杯子。
        pourInCup();

        //第四步:添加附加品。
        addCondiments();

        if(shouldDoSomething()){
            doSomething();
        }
    }

    protected boolean shouldDoSomething(){
        return false;
    }

    protected void doSomething(){
        System.out.println("做一些特殊的操作");
    }

    protected void boilWater(){
        System.out.println("把水煮沸");
    }

    protected abstract void brew();

    protected void pourInCup(){
        System.out.println("把饮料导入杯中");
    }

    protected abstract void addCondiments();
}
