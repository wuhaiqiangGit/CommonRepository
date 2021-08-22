package com.whq.designpattern.status.impl;

import com.whq.designpattern.status.BillState;

/**
 * @Description: 已退货状态
 * @Author: whq
 * @Date: 2021/8/22 16:37
 */
public class HasReturnedState implements BillState {
    @Override
    public String name() {
        return "已退货状态";
    }
}
