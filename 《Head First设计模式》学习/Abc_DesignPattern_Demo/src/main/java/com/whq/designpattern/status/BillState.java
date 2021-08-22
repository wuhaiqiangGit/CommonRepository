package com.whq.designpattern.status;

/**
 * @Description: 订单状态
 * @Author: whq
 * @Date: 2021/8/22 11:33
 */
public interface BillState {

    //状态名
    String name();

    //购物
    default void shopping(){
        throw new UnsupportedOperationException("状态：【"+this.getClass().getSimpleName()+"】下，不支持shopping操作");
    }

    //发货
    default void shipping(){
        throw new UnsupportedOperationException("状态：【"+this.getClass().getSimpleName()+"】下，不支持shipping操作");
    }

    //打包
    default void packaging(){
        throw new UnsupportedOperationException("状态：【"+this.getClass().getSimpleName()+"】下，不支持packaging操作");
    }

    //快递
    default void transport(){
        throw new UnsupportedOperationException("状态：【"+this.getClass().getSimpleName()+"】下，不支持transport操作");
    }

    //派送
    default void dispatch(){
        throw new UnsupportedOperationException("状态：【"+this.getClass().getSimpleName()+"】下，不支持dispatch操作");
    }

    //签收or拒签
    default void signAccept(boolean accept){
        throw new UnsupportedOperationException("状态：【"+this.getClass().getSimpleName()+"】下，不支持signAccept操作");
    }

}
