package com.xlaser4j.refactor.chapter7.case4;

/**
 * @package: com.xlaser4j.refactor.chapter7.case4
 * @author: Elijah.D
 * @time: 2020/3/23 14:04
 * @description:
 * @modified: Elijah.D
 */
public class InlineClass {
    public static void main(String[] args) {
        System.out.println("如果重构过程中,发现一个类不在承担足够的责任(由于重构移走了这个类的责任)," +
                "那么可以考虑使用InlineClass内联类除去这个类,恰好与Extract Class相反");
    }
}
