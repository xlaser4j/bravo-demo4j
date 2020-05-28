package com.xlaser4j.refactor.chapter8.case13;

/**
 * @package: com.xlaser4j.refactor.chapter8.case13
 * @author: Elijah.D
 * @time: 5/18/2020 7:37 PM
 * @description: 以类取代类型码
 * @modified: Elijah.D
 */
public class ReplaceTypeCodeWithClass {
    public static void main(String[] args) {
        System.out.println("使用常量(类型码)可以提高代码的可读性,但是作为参数的类型码,实际上仍然是常量背后的值," +
                "如数字: 这时编译器检查的仅仅是数字,而无法强制使用常量的符号名;这时如果把类型码换成类,就可以强制检查" +
                "传入的参数,减少bug产生");
    }
}
