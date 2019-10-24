package com.创建型模式.抽象工厂模式;


import com.创建型模式.抽象工厂模式.mobile.IMobile;
import com.创建型模式.抽象工厂模式.watch.IWatch;

/**
 * 抽象工厂，提供不同型号的手机和手表的生产方法
 */
public interface IFactory {
    /**
     * 生产手机
     */
    IMobile createMobile();

    /**
     * 生产手表
     */
    IWatch createWatch();
}
