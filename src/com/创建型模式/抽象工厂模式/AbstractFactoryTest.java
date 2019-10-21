package com.创建型模式.抽象工厂模式;


import com.创建型模式.工厂方法模式.mobile.IMobile;

/**
 * 测试类
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        //抽象工厂模式
        System.out.println("\n抽象工厂模式:");
        IFactory chinaFactory = new ChinaFactory();
        IMobile huaWeiMobile3 = chinaFactory.createHuaWeiMobile();
        huaWeiMobile3.show();
        IMobile appleMobile3 = chinaFactory.createAppleMobile();
        appleMobile3.show();

        IFactory usaFactory = new USAFactory();
        IMobile huaWeiMobile4 = usaFactory.createHuaWeiMobile();
        huaWeiMobile4.show();
        IMobile appleMobile4 = usaFactory.createAppleMobile();
        appleMobile4.show();
    }

}
