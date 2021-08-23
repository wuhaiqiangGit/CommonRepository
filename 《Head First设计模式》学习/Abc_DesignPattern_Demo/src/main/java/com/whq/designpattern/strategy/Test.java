package com.whq.designpattern.strategy;

import com.whq.designpattern.strategy.impl.OperationAdd;
import com.whq.designpattern.strategy.impl.OperationDiv;
import com.whq.designpattern.strategy.impl.OperationMul;
import com.whq.designpattern.strategy.impl.OperationSub;

/**
 * @Description: 测试类
 * @Author: whq
 * @Date: 2021/8/23 21:55
 */
public class Test {
    public static void main(String[] args) {
        CalculateStrategy operationAdd = new OperationAdd();
        CalculateStrategy operationSub = new OperationSub();
        CalculateStrategy operationMul = new OperationMul();
        CalculateStrategy operationDiv = new OperationDiv();
        CalculatorContext context = new CalculatorContext(operationMul);
        int result = context.executeStrategy(100, 100);
        System.out.println("result: "+result);
    }
}
