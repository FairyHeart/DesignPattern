package com.创建型模式.建造者模式;

/**
 * 抽象建造者：装修工人
 */
public interface IRoomBuilder {

    GuestRoom getGuestRoom();

    void buildWall();

    void buildTv();

    void buildBed();
}
