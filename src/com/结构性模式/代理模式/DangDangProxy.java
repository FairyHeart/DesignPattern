package com.结构性模式.代理模式;

/**
 * 当当代理，静态代理
 */
public class DangDangProxy implements IPublisher {

    private XinHuaPublisher publisher;

    public DangDangProxy() {
        publisher = new XinHuaPublisher();
    }

    //打折
    private void discount() {
        System.out.println("打折");
    }

    @Override
    public void sellBook() {
        this.discount();
        this.publisher.sellBook();
        this.giftCoupons();
    }

    //赠送优惠券
    private void giftCoupons() {
        System.out.println("赠送优惠券");
    }
}
