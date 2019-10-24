package com.创建型模式.抽象工厂模式;

import com.创建型模式.抽象工厂模式.mobile.AppleMobile;
import com.创建型模式.抽象工厂模式.mobile.IMobile;
import com.创建型模式.抽象工厂模式.watch.AppleWatch;
import com.创建型模式.抽象工厂模式.watch.IWatch;

/**
 * 美国工厂
 */
public class USAFactory implements IFactory {

    @Override
    public IMobile createMobile() {
        System.out.println("美国工厂 --> 生产了一部苹果手机");
        return new AppleMobile();
    }

    @Override
    public IWatch createWatch() {
        System.out.println("美国工厂 --> 生产了一部苹果手表");
        return new AppleWatch();
    }

}
