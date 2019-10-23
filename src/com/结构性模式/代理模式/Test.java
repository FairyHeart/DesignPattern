package com.结构性模式.代理模式;

/**
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        IMarket market = new MarketProxy();
        System.out.println(market.buyBag().toString());
    }

}
