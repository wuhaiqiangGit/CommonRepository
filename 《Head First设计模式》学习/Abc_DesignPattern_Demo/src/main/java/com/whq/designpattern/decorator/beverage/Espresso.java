package com.whq.designpattern.decorator.beverage;

import com.whq.designpattern.decorator.AbstractBeverage;

/**
 * @Description: 浓缩咖啡Espresso
 * @Author: whq
 * @Date: 2021/8/23 16:18
 */
public class Espresso extends AbstractBeverage {

    public Espresso() {
        setDescription("浓缩咖啡Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
