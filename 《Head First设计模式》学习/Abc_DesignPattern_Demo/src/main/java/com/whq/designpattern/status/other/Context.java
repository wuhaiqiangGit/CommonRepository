package com.whq.designpattern.status.other;

import lombok.Data;

/**
 * @Description: 上下文
 * @Author: whq
 * @Date: 2021/8/22 17:15
 */
@Data
public class Context {

    private State supervisorState;
    private State managerState;
    private State directorState;

    private State state;

    public Context() {
        this.supervisorState = new SupervisorState(this);
        this.managerState = new ManagerState(this);
        this.directorState = new DirectorState(this);
        this.state = supervisorState;
    }

    public void request(){
        this.state.handle();
    }
}
