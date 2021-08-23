package com.whq.designpattern.decorator;

import com.whq.designpattern.decorator.beverage.DarkRoast;
import com.whq.designpattern.decorator.decorator.MilkCondimentDecorator;
import com.whq.designpattern.decorator.decorator.MochaCondimentDecorator;

/**
 * @Description: 测试类
 * @Author: whq
 * @Date: 2021/8/23 16:25
 */
public class Test {
    public static void main(String[] args) {
        AbstractBeverage darkRoast = new DarkRoast();
        System.out.println("描述：" + darkRoast.getDescription() + "; 价格："+ darkRoast.cost());
        darkRoast = new MilkCondimentDecorator(darkRoast);
        System.out.println("描述：" + darkRoast.getDescription() + "; 价格："+ darkRoast.cost());
        darkRoast = new MochaCondimentDecorator(darkRoast);
        System.out.println("描述：" + darkRoast.getDescription() + "; 价格："+ darkRoast.cost());
    }
}
