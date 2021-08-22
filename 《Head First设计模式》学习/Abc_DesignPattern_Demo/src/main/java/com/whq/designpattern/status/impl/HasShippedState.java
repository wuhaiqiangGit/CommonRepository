package com.whq.designpattern.status.impl;

import com.whq.designpattern.status.BillState;
import com.whq.designpattern.status.GoodsLogisticsInfo;
import lombok.RequiredArgsConstructor;

/**
 * @Description: 已发货状态
 * @Author: whq
 * @Date: 2021/8/22 16:29
 */
@RequiredArgsConstructor
public class HasShippedState implements BillState {

    private final GoodsLogisticsInfo goodsLogisticsInfo;

    @Override
    public String name() {
        return "已发货状态";
    }

    @Override
    public void packaging() {
        System.out.println("开始揽件");
        goodsLogisticsInfo.setCurrentBillState(goodsLogisticsInfo.getHasPackagedState());
    }
}
