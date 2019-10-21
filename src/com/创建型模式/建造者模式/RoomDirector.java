package com.创建型模式.建造者模式;

/**
 * 指挥者：装修公司
 */
public class RoomDirector {

    private IRoomBuilder builder;

    public RoomDirector(IRoomBuilder builder) {
        this.builder = builder;
    }

    /**
     * 产品构建与组装方法：装修房子
     */
    public GuestRoom build() {
        builder.buildWall();
        builder.buildTv();
        builder.buildBed();
        return builder.getGuestRoom();
    }
}
