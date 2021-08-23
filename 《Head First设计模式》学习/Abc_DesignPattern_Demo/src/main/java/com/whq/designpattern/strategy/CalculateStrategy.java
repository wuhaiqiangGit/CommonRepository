package com.whq.designpattern.strategy;

/**
 * @Description: 抽象计算策略
 * @Author: whq
 * @Date: 2021/8/23 21:51
 */
public interface CalculateStrategy {
    int doOperation(int num1,int num2);
}
