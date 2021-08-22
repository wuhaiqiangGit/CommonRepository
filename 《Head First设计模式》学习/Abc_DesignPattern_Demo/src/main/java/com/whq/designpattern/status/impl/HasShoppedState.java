package com.whq.designpattern.status.impl;

import com.whq.designpattern.status.BillState;
import com.whq.designpattern.status.GoodsLogisticsInfo;
import lombok.RequiredArgsConstructor;

/**
 * @Description: 已购物状态
 * @Author: whq
 * @Date: 2021/8/22 16:27
 */
@RequiredArgsConstructor
public class HasShoppedState implements BillState {

    private final GoodsLogisticsInfo goodsLogisticsInfo;

    @Override
    public String name() {
        return "已购物状态";
    }

    @Override
    public void shipping() {
        System.out.println("开始发货");
        goodsLogisticsInfo.setCurrentBillState(goodsLogisticsInfo.getHasShippedState());
    }
}
