package com.whq.designpattern.status.other;

/**
 * @Description: 主管审批状态
 * @Author: whq
 * @Date: 2021/8/22 17:17
 */
public class SupervisorState extends State {

    public SupervisorState(Context context) {
        super(context);
    }

    @Override
    public void handle() {
        System.out.println("主管审批通过，下一个经理审批");
        context.setState(context.getManagerState());
    }
}
