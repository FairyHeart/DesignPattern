package com.创建型模式.建造者模式;


/**
 * 具体建造者：星级豪华客房装修工人
 */
public class StarRoomBuilder implements IRoomBuilder {

    private GuestRoom guestRoom = new GuestRoom();

    @Override
    public GuestRoom getGuestRoom() {
        return guestRoom;
    }

    @Override
    public void buildWall() {
        this.guestRoom.setWall("精装修的墙");
    }

    @Override
    public void buildTv() {
        this.guestRoom.setTv("智能电视机");
    }

    @Override
    public void buildBed() {
        this.guestRoom.setBed("欧式风格的床");
    }
}
