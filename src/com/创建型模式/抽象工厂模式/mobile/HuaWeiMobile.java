package com.创建型模式.抽象工厂模式.mobile;

/**
 * 华为手机
 */
public class HuaWeiMobile implements IMobile {
    @Override
    public void show() {
        System.out.println("品牌：HuaWei");
    }
}
