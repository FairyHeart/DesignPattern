package com.创建型模式.抽象工厂模式.watch;

/**
 * 苹果手表
 */
public class AppleWatch implements IWatch {
    @Override
    public void show() {
        System.out.println("Apple手表");
    }
}
