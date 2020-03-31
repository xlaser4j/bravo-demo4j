package com.xlaser4j.refactor.chapter8.case3;

/**
 * @package: com.xlaser4j.refactor.chapter8.case3
 * @author: Elijah.D
 * @time: 2020/3/31 16:12
 * @description: 将值对象改为引用对象
 * @modified: Elijah.D
 */
public class ChangeValueToReference {
    public static void main(String[] args) {
        System.out.println("对象分为值对象和引用对象: 前者就是像customer,account这种类,代表一真实世界的一个" +
                "实物,以等号比较是否相等;后者像date,money这种,完全由其数值定义,可以有很多copy,比如一个系统中有" +
                "很多日期对象;设计之初,或许是值对象,但是随着业务发展,需要当改动一个对象,就需要影响到所有的引用时," +
                "就需要将这个对象改成引用对象" +
                "这里的例子: customer是一个值对象,即使相同的订单也会拥有多个customer,但是本质上是同一个人,需要" +
                "改成引用对象,");
    }
}
