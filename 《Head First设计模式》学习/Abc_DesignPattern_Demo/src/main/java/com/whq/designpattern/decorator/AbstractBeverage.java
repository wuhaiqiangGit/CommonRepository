package com.whq.designpattern.decorator;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 饮料抽象类
 * @Author: whq
 * @Date: 2021/8/23 16:12
 */
public abstract class AbstractBeverage {

    @Getter
    @Setter
    private String description;

    /**
     * @Description: 价格
     * @Author: whq
     * @Date: 2021/8/23 16:11
     */
    public abstract double cost();
}
