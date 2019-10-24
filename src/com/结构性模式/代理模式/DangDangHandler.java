package com.结构性模式.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 当当代理，动态代理
 */
public class DangDangHandler implements InvocationHandler {

    private Object targetObject;

    /**
     * 该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
     * 第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
     * 第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口
     * 第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
     *
     * @param targetObject 根据传入的目标返回一个代理对象
     * @return
     */
    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }


    /**
     * 关联的这个实现类的方法被调用时将被执行
     * InvocationHandler接口的方法，proxy表示代理，method表示原对象被调用的方法，args表示方法的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.discount();
        //调用目标方法
        Object object = method.invoke(targetObject, args);
        this.giftCoupons();
        return object;
    }

    //打折
    private void discount() {
        System.out.println("打折");
    }

    //赠送优惠券
    private void giftCoupons() {
        System.out.println("赠送优惠券");
    }

}
