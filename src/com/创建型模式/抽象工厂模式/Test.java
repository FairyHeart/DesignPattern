package com.创建型模式.抽象工厂模式;


import com.创建型模式.抽象工厂模式.mobile.IMobile;
import com.创建型模式.抽象工厂模式.watch.IWatch;

/**
 * 测试类
 */
public class Test {

    public static void main(String[] args) {

        //抽象工厂模式
        IFactory chinaFactory = new ChinaFactory();
        IMobile huaWeiMobile = chinaFactory.createMobile();
        huaWeiMobile.show();
        IWatch huaWeiWatch = chinaFactory.createWatch();
        huaWeiWatch.show();

        IFactory usaFactory = new USAFactory();
        IMobile appleMobile = usaFactory.createMobile();
        appleMobile.show();
        IWatch appleWatch = usaFactory.createWatch();
        appleWatch.show();
    }

}
