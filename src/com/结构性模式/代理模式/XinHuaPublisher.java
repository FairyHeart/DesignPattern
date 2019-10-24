package com.结构性模式.代理模式;

/**
 * 新华出版社
 */
public class XinHuaPublisher implements IPublisher {

    @Override
    public void sellBook() {
        System.out.println("卖书");
    }
}
