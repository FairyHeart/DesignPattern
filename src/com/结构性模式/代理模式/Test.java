package com.结构性模式.代理模式;

/**
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        //静态代理
        System.out.println("静态代理:");
        IPublisher proxy = new DangDangProxy();
        proxy.sellBook();

        //动态代理
        System.out.println("\n动态代理:");
        DangDangHandler handler = new DangDangHandler();
        IPublisher proxy2 = (IPublisher) handler.newProxyInstance(new XinHuaPublisher());
        proxy2.sellBook();
    }

}
