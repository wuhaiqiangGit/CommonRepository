package com.whq.designpattern.status;

import com.whq.designpattern.status.impl.*;
import lombok.Data;

@Data
public class GoodsLogisticsInfo {

    //所有的状态
    private BillState startingState;
    private BillState hasShoppedState;
    private BillState hasShippedState;
    private BillState hasPackagedState;
    private BillState transportState;
    private BillState dispatchState;
    private BillState hasReceiptedState;
    private BillState hasReturnedState;

    //当前状态
    private BillState currentBillState;

    public GoodsLogisticsInfo() {
        this.startingState = new StartingState(this);
        this.hasShoppedState = new HasShoppedState(this);
        this.hasShippedState = new HasShippedState(this);
        this.hasPackagedState = new HasPackagedState(this);
        this.transportState = new TransportState(this);
        this.dispatchState = new DispatchState(this);
        this.hasReceiptedState = new HasReceiptedState();
        this.hasReturnedState = new HasReturnedState();

        this.currentBillState = startingState;
    }

    public void currentBillStatusInfo() {
        System.out.println("当前订单状态是：" + currentBillState.name());
    }

    public void shopping() {
        currentBillState.shopping();
    }

    public void shipping() {
        currentBillState.shipping();
    }

    public void packaging() {
        currentBillState.packaging();
    }

    public void transport() {
        currentBillState.transport();
    }

    public void dispatch() {
        currentBillState.dispatch();
    }

    public void signAccept(boolean accept) {
        currentBillState.signAccept(accept);
    }
}
