package com.创建型模式.抽象工厂模式;

import com.创建型模式.工厂方法模式.mobile.AppleMobile;
import com.创建型模式.工厂方法模式.mobile.HuaWeiMobile;
import com.创建型模式.工厂方法模式.mobile.IMobile;

/**
 * 美国手机工厂
 */
public class USAFactory implements IFactory {

    @Override
    public IMobile createHuaWeiMobile() {
        System.out.println("美国手机工厂 --> 生产了一部华为手机");
        return new HuaWeiMobile();
    }

    @Override
    public IMobile createAppleMobile() {
        System.out.println("美国手机工厂 --> 生产了一部苹果手机");
        return new AppleMobile();
    }

}
