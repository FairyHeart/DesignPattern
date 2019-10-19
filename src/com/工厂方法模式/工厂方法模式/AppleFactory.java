package com.工厂方法模式.工厂方法模式;

import com.工厂方法模式.mobile.AppleMobile;
import com.工厂方法模式.mobile.IMobile;

/**
 * 苹果手机工厂
 */
public class AppleFactory implements IFactory {

    @Override
    public IMobile createMobile() {
        System.out.println("苹果手机工厂 --> 生产了一部苹果手机");
        return new AppleMobile();
    }
}
