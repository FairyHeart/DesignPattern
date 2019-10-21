package com.创建型模式.建造者模式;


/**
 * 测试类
 */
public class BuilderTest {

    public static void main(String[] args) {

        IRoomBuilder builder = new NomalRoomBuilder();
        RoomDirector director = new RoomDirector(builder);
        GuestRoom guestRoom = director.build();
        guestRoom.show();

        IRoomBuilder starBuilder = new StarRoomBuilder();
        RoomDirector director1 = new RoomDirector(starBuilder);
        GuestRoom guestRoom1 = director1.build();
        guestRoom1.show();
    }

}
