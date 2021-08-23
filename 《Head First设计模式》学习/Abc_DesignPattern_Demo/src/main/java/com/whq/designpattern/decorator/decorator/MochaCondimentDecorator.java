package com.whq.designpattern.decorator.decorator;

import com.whq.designpattern.decorator.AbstractBeverage;

/** 
 * @Description: 摩卡装饰器类 
 * @Author: whq
 * @Date: 2021/8/23 16:25
 */
public class MochaCondimentDecorator extends AbstractCondimentDecorator {

    public MochaCondimentDecorator(AbstractBeverage abstractBeverage) {
        super(abstractBeverage);
    }

    @Override
    public String getDescription() {
        //被装饰者原来的描述
        String description = abstractBeverage.getDescription();
        return description + " +摩卡mocha";
    }

    @Override
    public double cost() {
        //被装饰者原来的价格
        double oldCost = abstractBeverage.cost();
        return oldCost + 0.1;
    }
}
