package com.whq.designpattern.strategy;

/**
 * @Description: 计算上下文
 * @Author: whq
 * @Date: 2021/8/23 21:54
 */
public class CalculatorContext {

    private CalculateStrategy calculateStrategy;

    public CalculatorContext(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public int executeStrategy(int num1,int num2){
        return calculateStrategy.doOperation(num1,num2);
    }
}
