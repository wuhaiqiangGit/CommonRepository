package com.whq.designpattern.status.impl;

import com.whq.designpattern.status.BillState;
import com.whq.designpattern.status.GoodsLogisticsInfo;
import lombok.RequiredArgsConstructor;

/**
 * @Description: 已揽件状态
 * @Author: whq
 * @Date: 2021/8/22 16:31
 */
@RequiredArgsConstructor
public class HasPackagedState implements BillState {

    private final GoodsLogisticsInfo goodsLogisticsInfo;

    @Override
    public String name() {
        return "已揽件状态";
    }

    @Override
    public void transport() {
        System.out.println("物流开始运输");
        goodsLogisticsInfo.setCurrentBillState(goodsLogisticsInfo.getTransportState());
    }
}
