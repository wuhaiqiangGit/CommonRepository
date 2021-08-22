package com.whq.designpattern.status.other;

/**
 * @Description: 经理审批状态
 * @Author: whq
 * @Date: 2021/8/22 17:18
 */
public class ManagerState extends State {

    public ManagerState(Context context) {
        super(context);
    }

    @Override
    public void handle() {
        System.out.println("经理审批通过，下一个总监审批");
        context.setState(context.getDirectorState());
    }
}
