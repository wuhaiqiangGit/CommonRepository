package com.whq.designpattern.status.impl;

import com.whq.designpattern.status.BillState;
import com.whq.designpattern.status.GoodsLogisticsInfo;
import lombok.RequiredArgsConstructor;

/**
 * @Description: 投递状态
 * @Author: whq
 * @Date: 2021/8/22 16:34
 */
@RequiredArgsConstructor
public class DispatchState implements BillState {

    private final GoodsLogisticsInfo goodsLogisticsInfo;

    @Override
    public String name() {
        return "投递状态";
    }

    @Override
    public void signAccept(boolean accept) {
        if (accept){
            System.out.println("买家签收，进入已收货状态");
            goodsLogisticsInfo.setCurrentBillState(goodsLogisticsInfo.getHasReceiptedState());
        }else {
            System.out.println("买家拒绝签收，进入退货状态");
            goodsLogisticsInfo.setCurrentBillState(goodsLogisticsInfo.getHasReturnedState());
        }
    }
}
