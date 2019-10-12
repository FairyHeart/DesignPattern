package com.原型模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型类
 */
public class ProtoType implements Cloneable {

    public String id;

    public List<String> ids;

    public ProtoSubType subType;

    public ProtoType(String id, List<String> ids, ProtoSubType subType) {
        this.id = id;
        this.ids = ids;
        this.subType = subType;
    }

    /**
     * 浅度克隆：克隆的是对象的引用
     */
    public ProtoType clone() throws CloneNotSupportedException {
        return (ProtoType) super.clone();
    }

    /**
     * 深度克隆：克隆的是对象的值
     */
    public ProtoType clone2() throws CloneNotSupportedException {
        ProtoType protoType = (ProtoType) super.clone();
        List<String> ids = new ArrayList<String>();
        if (this.ids != null) {
            ids.addAll(this.ids);
        }
        protoType.ids = ids;
        protoType.subType = (this.subType.clone());
        return protoType;
    }

    @Override
    public String toString() {
        return "{" + "id='" + id + '\'' + ", ids=" + ids + ", subType=" + subType.toString() + '}';
    }

}
