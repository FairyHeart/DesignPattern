package com.单列模式;


import java.lang.reflect.Constructor;

public class SingletonTest {

    public static void main(String[] args) throws Exception {

        com.单列模式.内部类.Singleton singleton = com.单列模式.内部类.Singleton.getInstance();
        Constructor<com.单列模式.内部类.Singleton> constructor = com.单列模式.内部类.Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        com.单列模式.内部类.Singleton newSingleton = constructor.newInstance();
        System.out.println(singleton == newSingleton);
    }

}
