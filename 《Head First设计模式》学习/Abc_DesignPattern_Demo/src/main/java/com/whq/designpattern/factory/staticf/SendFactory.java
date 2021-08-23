package com.whq.designpattern.factory.staticf;

import com.whq.designpattern.factory.Sender;
import com.whq.designpattern.factory.impl.MailSender;
import com.whq.designpattern.factory.impl.SmsSender;

/**
 * @Description: 静态工厂方法
 * @Author: whq
 * @Date: 2021/8/23 10:52
 */
public class SendFactory {

    public static Sender produce(String type){
        if ("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("输入有误");
            return null;
        }
    }
}
