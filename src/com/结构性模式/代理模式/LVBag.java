package com.结构性模式.代理模式;

/**
 * LV包
 */
public class LVBag {

    private double money;

    public LVBag(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "LV包 " + money + "元";
    }
}
