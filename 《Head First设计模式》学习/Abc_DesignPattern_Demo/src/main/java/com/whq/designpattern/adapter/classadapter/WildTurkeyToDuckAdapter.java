package com.whq.designpattern.adapter.classadapter;

import com.whq.designpattern.adapter.Duck;
import com.whq.designpattern.adapter.WildTurkey;

/**
 * @Description: 继承类适配器
 * @Author: whq
 * @Date: 2021/8/23 9:33
 */
public class WildTurkeyToDuckAdapter extends WildTurkey implements Duck {
    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fastFly();
    }
}
