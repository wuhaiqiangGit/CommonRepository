package com.whq.designpattern.decorator.decorator;

import com.whq.designpattern.decorator.AbstractBeverage;

/**
 * @Description: 装饰器抽象类
 * @Author: whq
 * @Date: 2021/8/23 16:20
 */
public abstract class AbstractCondimentDecorator extends AbstractBeverage {

    //被装饰者
    protected AbstractBeverage abstractBeverage;

    public AbstractCondimentDecorator(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public abstract String getDescription();
}
