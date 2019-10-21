package com.创建型模式.建造者模式;

/**
 * 具体建造者：普通客房装修工人
 */
public class NomalRoomBuilder implements IRoomBuilder {

    private GuestRoom guestRoom = new GuestRoom();

    @Override
    public GuestRoom getGuestRoom() {
        return guestRoom;
    }

    @Override
    public void buildWall() {
        this.guestRoom.setWall("毛坯装修墙");
    }

    @Override
    public void buildTv() {
        this.guestRoom.setTv("黑白电视");
    }

    @Override
    public void buildBed() {
        this.guestRoom.setBed("木板床");
    }
}
