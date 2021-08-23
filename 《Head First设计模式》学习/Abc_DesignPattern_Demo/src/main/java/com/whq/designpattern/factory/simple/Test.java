package com.whq.designpattern.factory.simple;

import com.whq.designpattern.factory.Sender;

/**
 * @Description: 测试类
 * @Author: whq
 * @Date: 2021/8/23 10:50
 */
public class Test {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender smsSender = factory.produce("sms");
        smsSender.send();
        Sender mailSender = factory.produce("mail");
        mailSender.send();
    }
}
