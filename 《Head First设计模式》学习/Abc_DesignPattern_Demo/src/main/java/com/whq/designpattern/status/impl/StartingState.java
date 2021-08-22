package com.whq.designpattern.status.impl;

import com.whq.designpattern.status.BillState;
import com.whq.designpattern.status.GoodsLogisticsInfo;
import lombok.RequiredArgsConstructor;

/**
 * @Description: 订单开始状态
 * @Author: whq
 * @Date: 2021/8/22 16:19
 */
@RequiredArgsConstructor
public class StartingState implements BillState {

    private final GoodsLogisticsInfo goodsLogisticsInfo;

    @Override
    public String name() {
        return "起始状态";
    }

    @Override
    public void shopping() {
        System.out.println("开始购物");
        goodsLogisticsInfo.setCurrentBillState(goodsLogisticsInfo.getHasShoppedState());
    }
}
