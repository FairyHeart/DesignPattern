package com.创建型模式.工厂方法模式.简单工厂模式;

import com.创建型模式.工厂方法模式.mobile.AppleMobile;
import com.创建型模式.工厂方法模式.mobile.HuaWeiMobile;
import com.创建型模式.工厂方法模式.mobile.IMobile;
import com.创建型模式.工厂方法模式.mobile.OppoMobile;

/**
 * 手机工厂
 */
public class MobileSimpleFactory {
    /**
     * 生成手机
     *
     * @param model 型号
     * @return
     */
    public IMobile createMobile(String model) {
        if (model.equalsIgnoreCase("HuaWei")) {
            System.out.println("手机工厂 --> 生产了一部华为手机");
            return new HuaWeiMobile();
        } else if (model.equalsIgnoreCase("Apple")) {
            System.out.println("手机工厂 --> 生产了一部苹果手机");
            return new AppleMobile();
        } else if (model.equalsIgnoreCase("Oppo")) {
            System.out.println("手机工厂 --> 生产了一部Oppo手机");
            return new OppoMobile();
        }
        return null;
    }
}
