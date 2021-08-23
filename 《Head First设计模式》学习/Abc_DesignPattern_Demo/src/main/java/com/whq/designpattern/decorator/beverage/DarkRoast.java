package com.whq.designpattern.decorator.beverage;

import com.whq.designpattern.decorator.AbstractBeverage;

/**
 * @Description: 焦炒咖啡DarkRoast
 * @Author: whq
 * @Date: 2021/8/23 16:13
 */
public class DarkRoast extends AbstractBeverage {

    public DarkRoast() {
        setDescription("焦炒咖啡DarkRoast");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
