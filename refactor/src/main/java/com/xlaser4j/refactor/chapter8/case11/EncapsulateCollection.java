package com.xlaser4j.refactor.chapter8.case11;

/**
 * @package: com.xlaser4j.refactor.chapter8.case11
 * @author: Elijah.D
 * @time: 5/18/2020 6:20 PM
 * @description: 封装集合
 * @modified: Elijah.D
 */
public class EncapsulateCollection {
    public static void main(String[] args) {
        System.out.println("一个类中使用集合,需要考虑数据的封装问题,不要直接使用get/set方法设值取值,提供对应的方法" +
                "同时get返回的是unmodifiable集合等???");
    }
}
