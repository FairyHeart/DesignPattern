package com.工厂方法模式;

import com.工厂方法模式.mobile.IMobile;
import com.工厂方法模式.工厂方法模式.AppleFactory;
import com.工厂方法模式.工厂方法模式.HuaWeiFactory;
import com.工厂方法模式.工厂方法模式.IFactory;
import com.工厂方法模式.抽象工程模式.ChinaFactory;
import com.工厂方法模式.抽象工程模式.USAFactory;
import com.工厂方法模式.简单工厂模式.MobileSimpleFactory;

/**
 * 测试类
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        //简单工厂模式
        System.out.println("简单工厂模式:");
        MobileSimpleFactory simpleFactory = new MobileSimpleFactory();
        IMobile huaWeiMobile = simpleFactory.createMobile("HuaWei");
        huaWeiMobile.show();
        IMobile appleMobile = simpleFactory.createMobile("Apple");
        appleMobile.show();

        //工厂方法模式
        System.out.println("\n工厂方法模式:");
        IFactory huaWeiFactory = new HuaWeiFactory();
        IMobile huaWeiMobile2 = huaWeiFactory.createMobile();
        huaWeiMobile2.show();

        IFactory appleFactory = new AppleFactory();
        IMobile appleMobile2 = appleFactory.createMobile();
        appleMobile2.show();

        //抽象工厂模式
        System.out.println("\n抽象工厂模式:");
        com.工厂方法模式.抽象工程模式.IFactory chinaFactory = new ChinaFactory();
        IMobile huaWeiMobile3 = chinaFactory.createHuaWeiMobile();
        huaWeiMobile3.show();
        IMobile appleMobile3 = chinaFactory.createAppleMobile();
        appleMobile3.show();

        com.工厂方法模式.抽象工程模式.IFactory usaFactory = new USAFactory();
        IMobile huaWeiMobile4 = usaFactory.createHuaWeiMobile();
        huaWeiMobile4.show();
        IMobile appleMobile4 = usaFactory.createAppleMobile();
        appleMobile4.show();
    }

}
