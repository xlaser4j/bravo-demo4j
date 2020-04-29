package com.xlaser4j.refactor.chapter8.case10;

/**
 * @package: com.xlaser4j.refactor.chapter8.case10
 * @author: Elijah.D
 * @time: 4/29/2020 11:14 AM
 * @description:
 * @modified: Elijah.D
 */
public class EncapsulateField {
    public static void main(String[] args) {
        System.out.println("面向对象的首要原则是就是封装,或者称之为隐藏数据;按此原则,不应该将数据声明为public而是" +
                "通过提供public的get/set方法访问数据,否则其他对象可以直接修改数据,而该对象却不知道,这就是数据和行为" +
                "被分开了,降低了程序的模块化,如果要修改代码可能程序中到处都是引用,难以维护;");
    }
}
