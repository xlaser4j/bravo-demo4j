package com.xlaser4j.refactor.chapter8.case16;

/**
 * @package: com.xlaser4j.refactor.chapter8.case16
 * @author: Elijah.D
 * @time: 5/28/2020 3:30 PM
 * @description: 以字段去取代子类
 * @modified: Elijah.D
 */
public class ReplaceSubclassWithFields {
    public static void main(String[] args) {
        System.out.println("当子类只包含常量函数时,可以去除这样的子类,降低因继承带来的额外复杂性");
    }
}
