package com.结构性模式.代理模式;

/**
 * 代理商
 */
public class MarketProxy implements IMarket {

    private JapanMarket japanMarket = new JapanMarket();

    private double tollFee() {
        return 3000;
    }

    @Override
    public LVBag buyBag() {
        LVBag lvBag = japanMarket.buyBag();
        lvBag.setMoney(lvBag.getMoney() + this.tollFee() + this.taxes());
        return lvBag;
    }

    private double taxes() {
        return 1000;
    }
}
