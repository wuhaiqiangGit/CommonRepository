package com.whq.designpattern.status.other;

/**
 * @Description: 总监审批状态
 * @Author: whq
 * @Date: 2021/8/22 17:19
 */
public class DirectorState extends State {


    public DirectorState(Context context) {
        super(context);
    }

    @Override
    public void handle() {
        System.out.println("总监审批通过，最后一个审批者");
        System.out.println("审批通过，打款5万");
    }
}
