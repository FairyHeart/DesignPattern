package com.创建型模式.建造者模式;

/**
 * 客房
 */
public class GuestRoom {
    //墙
    private String wall;
    //电视
    private String tv;
    //床
    private String bed;

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    /**
     * 展示酒店信息
     */
    public void show() {
        System.out.println(wall + " " + tv + " " + bed);
    }
}
