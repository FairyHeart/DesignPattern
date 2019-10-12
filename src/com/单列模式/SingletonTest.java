package com.单列模式;


import com.单列模式.懒汉式.Singleton;

public class SingletonTest {

    public static void main(String[] args) {
//        test1();
        test2();
//        test3();
    }

    /**
     * 线程不安全,懒汉式1
     */
    private static void test1() {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton.getInstance1());
                }
            }).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton.getInstance1());
                }
            }).start();
        }
    }

    /**
     * 线程不安全，懒汉式3
     */
    private static void test2() {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton.getInstance3());
                }
            }).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton.getInstance3());
                }
            }).start();
        }
    }

    /**
     * 线程不安全，双重校验锁没有volatile，无法重现
     */
    private static void test3() {

    }
}
