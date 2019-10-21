package com.创建型模式.单列模式.内部类;

import java.lang.reflect.Constructor;

/**
 * 内部类[推荐用]
 * <p>
 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
 * 不同的地方:
 * 在饿汉式方式是只要Singleton类被装载就会实例化,
 * 内部类是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类
 * <p>
 * 优点：避免了线程不安全，延迟加载，效率高。
 */

public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }

    public static void main(String[] args) throws Exception {
        //似乎静态内部类看起来已经是最完美的方法了，其实不是，可能还存在反射攻击或者反序列化攻击。
        Singleton singleton = Singleton.getInstance();
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton newSingleton = constructor.newInstance();
        System.out.println(singleton == newSingleton);
    }
}
