package com.创建型模式.工厂方法模式.工厂方法模式;

import com.创建型模式.工厂方法模式.mobile.IMobile;
import com.创建型模式.工厂方法模式.mobile.OppoMobile;

/**
 * Oppo手机工厂
 */
public class OppoFactory implements IFactory {

    @Override
    public IMobile createMobile() {
        System.out.println("Oppo手机工厂 --> 生产了一部Oppo手机");
        return new OppoMobile();
    }
}
