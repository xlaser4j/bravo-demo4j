package com.xlaser4j.refactor.chapter7.case1;

/**
 * @package: com.xlaser4j.refactor.chapter7.case1
 * @author: Elijah.D
 * @time: 2020/3/23 13:09
 * @description:
 * @modified: Elijah.D
 */
public class MoveMethod {
    public static void main(String[] args) {
        System.out.println("" +
                "当一个方法所在的类,与其他类进行交互,而且交互次数比本类还要多,那么可以考虑MoveMethod," +
                "降低类之间的耦合度,使其职责更加清晰可控");
    }
}
