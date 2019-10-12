package com.原型模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式测试类
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        ProtoType protoType1 = getProtoType();
        ProtoType protoType2 = getProtoType();
        test("浅度克隆：克隆的是对象的引用", protoType1, protoType1.clone());
        test("\n深度克隆：克隆的是对象的值", protoType2, protoType2.clone2());
    }

    private static ProtoType getProtoType() {
        List<String> ids = new ArrayList<>();
        ids.add("b");
        ids.add("c");
        ProtoType protoType = new ProtoType("a", ids, new ProtoSubType("李四"));
        return protoType;
    }


    private static void test(String pritMsg, ProtoType protoType1, ProtoType protoType2) {
        System.out.println(pritMsg);
        System.out.println(protoType1 == protoType2);
        System.out.println("protoType1 = " + protoType1.toString() + " / protoType2 = " + protoType2.toString());

        protoType2.id = "x";
        protoType2.ids.add("y");
        protoType2.subType.name = "王五";
        System.out.println("protoType1 = " + protoType1.toString() + " / protoType2 = " + protoType2.toString());
    }

}
