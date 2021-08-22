package com.whq.designpattern.status;

/**
 * @Description: 测试类
 * @Author: whq
 * @Date: 2021/8/22 16:42
 */
public class Test {

    public static void main(String[] args) {
        GoodsLogisticsInfo goodInfo = new GoodsLogisticsInfo();
        goodInfo.currentBillStatusInfo();
        goodInfo.shopping();
        goodInfo.currentBillStatusInfo();
        goodInfo.shipping();
        goodInfo.currentBillStatusInfo();
        goodInfo.packaging();
        goodInfo.currentBillStatusInfo();
        goodInfo.transport();
        goodInfo.currentBillStatusInfo();
        goodInfo.dispatch();
        goodInfo.currentBillStatusInfo();
        goodInfo.signAccept(false);
        goodInfo.currentBillStatusInfo();

        goodInfo.signAccept(true);
    }
}
