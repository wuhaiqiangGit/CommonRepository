package com.whq.designpattern.factory.abstractf;

import com.whq.designpattern.factory.Sender;
import com.whq.designpattern.factory.impl.MailSender;

/**
 * @Description: mailSender工厂类
 * @Author: whq
 * @Date: 2021/8/23 10:57
 */
public class MailSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
