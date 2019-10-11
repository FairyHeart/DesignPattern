package com.单列模式.懒汉式;

/**
 * 单例模式的懒汉式
 */
public class Singleton {

    private Singleton() {
    }

    /**
     * 1.单例模式的懒汉式[线程不安全，不可用]
     */
    private static Singleton instance1;

    public static Singleton getInstance1() {
        if (instance1 == null) {// 这里线程是不安全的,可能得到两个不同的实例
            instance1 = new Singleton();
        }
        return instance1;
    }

    /**
     * 2.懒汉式线程安全的:[线程安全，效率低不推荐使用]
     * <p>
     * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
     */
    private static Singleton instance2;

    public static synchronized Singleton getInstance2() {
        if (instance2 == null) {
            instance2 = new Singleton();
        }
        return instance2;
    }

    /**
     * 3.单例模式懒汉式[线程不安全，不可用]
     * <p>
     * 虽然加了锁，但是等到第一个线程执行完instance=new SingletonTest()跳出这个锁时，另一个进入if语句的线程同样会实例化另外一个Singleton对象，线程不安全的原理跟3类似。
     */
    private static Singleton instance3;

    public static Singleton getInstance3() {
        if (instance3 == null) {
            synchronized (Singleton.class) {// 线程不安全
                instance3 = new Singleton();
            }
        }
        return instance3;
    }

    /**
     * 4.单例模式懒汉式双重校验锁[推荐用]
     * <p>
     * 懒汉式变种,属于懒汉式的最好写法,保证了:延迟加载和线程安全
     * <p>
     * volatile:(1)确保instance每次均在主内存中读取，这样虽然会牺牲一点效率，但也无伤大雅。
     *          (2)可以保证即使java虚拟机对代码执行了指令重排序，也会保证它的正确性。
     */
    private volatile static Singleton instance4;

    public static Singleton getInstance4() {
        if (instance4 == null) {
            synchronized (Singleton.class) {
                if (instance4 == null) {
                    instance4 = new Singleton();
                }
            }
        }
        return instance4;
    }

    /**
     * 根据java的语言规范，没有volatile是不可靠的，出现问题主要原因：
     * （1）编译器优化了程序指令, 以加快cpu处理速度
     * （2）多核cpu动态调整指令顺序, 以加快并行运算能力.
     *
     * 问题出现的顺序:
     * 1.线程A, 发现对象未实例化, 准备开始实例化
     * 2.由于编译器优化了程序指令, 允许对象在构造函数未调用完前, 将共享变量的引用指向部分构造的对象, 虽然对象未完全实例化, 但已经不为null了.
     * 3.线程B, 发现部分构造的对象已不是null, 则直接返回了该对象.
     *
     * 解决办法:
     * 可以将instance声明为volatile，即 private volatile static Singleton instance
     * 在线程B读一个volatile变量后，线程A在写这个volatile变量之前，所有可见的共享变量的值都将立即变得对线程B可见。
     */
}
