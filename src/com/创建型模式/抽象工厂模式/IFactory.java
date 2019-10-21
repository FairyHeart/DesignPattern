package com.创建型模式.抽象工厂模式;

import com.创建型模式.工厂方法模式.mobile.IMobile;

/**
 * 抽象手机工厂，提供不同型号的手机的生产方法
 */
public interface IFactory {
    /**
     * 生产华为手机
     */
    IMobile createHuaWeiMobile();

    /**
     * 生产Apple手机
     */
    IMobile createAppleMobile();

}
