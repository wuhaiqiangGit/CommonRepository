package com.whq.designpattern.strategy.impl;

import com.whq.designpattern.strategy.CalculateStrategy;

/**
 * @Description: 减法策略
 * @Author: whq
 * @Date: 2021/8/23 21:52
 */
public class OperationSub implements CalculateStrategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
