package com.whq.designpattern.decorator;

import com.whq.designpattern.decorator.beverage.DarkRoast;
import com.whq.designpattern.decorator.decorator.MilkCondimentDecorator;
import com.whq.designpattern.decorator.decorator.MochaCondimentDecorator;
import com.whq.designpattern.decorator.other.LowerCaseInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Description: 测试类
 * @Author: whq
 * @Date: 2021/8/23 16:25
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //testDecorator();
        testIoDecorator();
    }

    public static void testDecorator() {
        AbstractBeverage darkRoast = new DarkRoast();
        System.out.println("描述：" + darkRoast.getDescription() + "; 价格：" + darkRoast.cost());
        darkRoast = new MilkCondimentDecorator(darkRoast);
        System.out.println("描述：" + darkRoast.getDescription() + "; 价格：" + darkRoast.cost());
        darkRoast = new MochaCondimentDecorator(darkRoast);
        System.out.println("描述：" + darkRoast.getDescription() + "; 价格：" + darkRoast.cost());
    }

    public static void testIoDecorator() throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream("ABCDEFG".getBytes());
        InputStream in = new LowerCaseInputStream(inputStream);
        int c;
        while ((c = in.read()) > 0){
            System.out.print((char)c);
        }
        in.close();

        /*byte[] temp = new byte[8];
        int result;
        while ((result = in.read(temp, 0, temp.length)) != -1) {
            System.out.println(new String(temp, "utf-8"));
        }
        in.close();*/
    }
}
