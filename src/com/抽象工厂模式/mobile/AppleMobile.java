package com.抽象工厂模式.mobile;

/**
 * 苹果手机
 *
 */
public class AppleMobile implements IMobile {
    @Override
    public void show() {
        System.out.println("品牌：Apple");
    }
}
