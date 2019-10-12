package com.原型模式;

/**
 * 原型类里面的子类对象
 */
public class ProtoSubType implements Cloneable {

    public String name;

    public ProtoSubType(String name) {
        this.name = name;
    }

    public ProtoSubType clone() throws CloneNotSupportedException {
        return (ProtoSubType) super.clone();
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' + '}';
    }
}
