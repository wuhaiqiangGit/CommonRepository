package com.whq.designpattern.decorator.beverage;

import com.whq.designpattern.decorator.AbstractBeverage;

/**
 * @Description: 首选咖啡HouseBlend
 * @Author: whq
 * @Date: 2021/8/23 16:18
 */
public class HouseBlend extends AbstractBeverage {

    public HouseBlend() {
        setDescription("首选咖啡HouseBlend");
    }

    @Override
    public double cost() {
        return 1.90;
    }
}
