package com.创建型模式.工厂方法模式.工厂方法模式;

import com.创建型模式.工厂方法模式.mobile.HuaWeiMobile;
import com.创建型模式.工厂方法模式.mobile.IMobile;

/**
 * 华为手机工厂
 */
public class HuaWeiFactory implements IFactory {

    @Override
    public IMobile createMobile() {
        System.out.println("华为手机工厂 --> 生产了一部华为手机");
        return new HuaWeiMobile();
    }
}
