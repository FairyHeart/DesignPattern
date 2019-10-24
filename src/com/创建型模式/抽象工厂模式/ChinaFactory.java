package com.创建型模式.抽象工厂模式;


import com.创建型模式.抽象工厂模式.mobile.HuaWeiMobile;
import com.创建型模式.抽象工厂模式.mobile.IMobile;
import com.创建型模式.抽象工厂模式.watch.HuaWeiWatch;
import com.创建型模式.抽象工厂模式.watch.IWatch;

/**
 * 中国工厂
 */
public class ChinaFactory implements IFactory {

    @Override
    public IMobile createMobile() {
        System.out.println("中国工厂 --> 生产了一部华为手机");
        return new HuaWeiMobile();
    }

    @Override
    public IWatch createWatch() {
        System.out.println("中国工厂 --> 生产了一部华为手表");
        return new HuaWeiWatch();
    }

}
