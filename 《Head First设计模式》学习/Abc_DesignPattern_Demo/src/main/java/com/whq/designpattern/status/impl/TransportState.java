package com.whq.designpattern.status.impl;

import com.whq.designpattern.status.BillState;
import com.whq.designpattern.status.GoodsLogisticsInfo;
import lombok.RequiredArgsConstructor;

/**
 * @Description: 运输状态
 * @Author: whq
 * @Date: 2021/8/22 16:33
 */
@RequiredArgsConstructor
public class TransportState implements BillState {

    private final GoodsLogisticsInfo goodsLogisticsInfo;

    @Override
    public String name() {
        return "运输状态";
    }

    @Override
    public void dispatch() {
        System.out.println("开始投递");
        goodsLogisticsInfo.setCurrentBillState(goodsLogisticsInfo.getDispatchState());
    }
}
