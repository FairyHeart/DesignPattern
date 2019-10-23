package com.结构性模式.代理模式;

/**
 * 日本商场
 */
public class JapanMarket implements IMarket {

    @Override
    public LVBag buyBag() {
        return new LVBag(20000);
    }

}
