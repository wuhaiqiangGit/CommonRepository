package com.whq.designpattern.factory.impl;

import com.whq.designpattern.factory.Sender;

/**
 * @Description: 邮件发送
 * @Author: whq
 * @Date: 2021/8/23 10:47
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("使用邮件发送信息");
    }
}
