package com.创建型模式.单列模式.懒汉式;

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
     * 虽然加了锁，但是等到第一个线程执行完instance=new Singleton()跳出这个锁时，另一个进入if语句的线程同样会实例化另外一个Singleton对象
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
     * (2)可以保证即使java虚拟机对代码执行了指令重排序，也会保证它的正确性。
     */
    private volatile static Singleton instance4;

    public static Singleton getInstance4() {//1
        if (instance4 == null) { //2 第一次检查
            synchronized (Singleton.class) {//3 加锁
                if (instance4 == null) { //4 第二次检查
                    instance4 = new Singleton(); //5 创建对象
                }
            }
        }
        return instance4;
    }

    /**
     * 上述的Instance类变量是没有用volatile关键字修饰的，根据java的语言规范，没有volatile是不可靠的，会出现一个问题：在线程执行到第2行的时候，
     * 代码读取到instance不为null时，instance引用的对象有可能没有完成初始化。 主要的原因是重排序。重排序是指编译器和处理器为了优化程序性能而对指
     * 令序列进行重新排序的一种手段。 第5行的代码创建了一个对象，这一行代码可以分解成3个操作：
     * <p>
     * memory = allocate();　　// 1：分配对象的内存空间
     * ctorInstance(memory);　// 2：初始化对象
     * instance = memory;　　// 3：设置instance指向刚分配的内存地址
     * <p>
     * 根源在于代码中的2和3之间，可能会被重排序。例如：
     * <p>
     * memory = allocate();　　// 1：分配对象的内存空间
     * instance = memory;　　// 3：设置instance指向刚分配的内存地址
     * // 注意，此时对象还没有被初始化！
     * ctorInstance(memory);　// 2：初始化对象
     * <p>
     * 这在单线程环境下是没有问题的，但在多线程环境下会出现问题：假如有两个线程A和B，当B线程运行到B2位置的时候，B线程会看到一个还没有被初始化的对象。
     * A2和A3的重排序不影响线程A的最终结果，但会导致线程B在B2处判断出instance不为空，线程B接下来将访问instance引用的对象。此时，线程B将会访问
     * 到一个还未初始化的对象。 所以只需要做一点小的修改（把instance声明为volatile型），就可以实现线程安全的延迟初始化。因为被volatile关键字
     * 修饰的变量是被禁止重排序的。
     */

    private static Singleton instance5;

    public static Singleton getInstance5() {//1
        if (instance5 == null) { //2 第一次检查
            synchronized (Singleton.class) {//3 加锁
                if (instance5 == null) { //4 第二次检查
                    instance5 = new Singleton(); //5 创建对象
                }
            }
        }
        return instance5;
    }

}
