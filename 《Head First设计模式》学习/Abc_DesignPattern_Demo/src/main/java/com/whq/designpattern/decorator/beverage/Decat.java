package com.whq.designpattern.decorator.beverage;

import com.whq.designpattern.decorator.AbstractBeverage;

/** 
 * @Description: 低浓缩咖啡Decat 
 * @Author: whq
 * @Date: 2021/8/23 16:18
 */
public class Decat extends AbstractBeverage {

    public Decat() {
        setDescription("低浓缩咖啡Decat");
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
