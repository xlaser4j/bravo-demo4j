package com.xlaser4j.refactor.chapter7.case2;

/**
 * @package: com.xlaser4j.refactor.chapter7.case1
 * @author: Elijah.D
 * @time: 2020/3/23 13:09
 * @description:
 * @modified: Elijah.D
 */
public class MoveField {
    public static void main(String[] args) {
        System.out.println("" +
                "当某个字段被其所驻类之外的另外一个类引用(getter/setter)更多,那么可以考虑MoveField,使其职责更加清晰可控");
    }
}
