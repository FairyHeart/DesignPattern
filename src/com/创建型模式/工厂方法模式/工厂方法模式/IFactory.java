package com.创建型模式.工厂方法模式.工厂方法模式;

import com.创建型模式.工厂方法模式.mobile.IMobile;

/**
 * 抽象手机工厂，提供手机的生产方法
 */
public interface IFactory {

    IMobile createMobile();

}
