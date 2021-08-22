package com.whq.designpattern.status.other;

/**
 * @Description: 状态抽象类
 * @Author: whq
 * @Date: 2021/8/22 17:14
 */
public abstract class State {

    protected Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public State(Context context) {
        this.context = context;
    }

    public abstract void handle();
}
