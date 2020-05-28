package com.xlaser4j.refactor.chapter8.case14;

/**
 * @package: com.xlaser4j.refactor.chapter8.case14
 * @author: Elijah.D
 * @time: 5/20/2020 10:07 AM
 * @description: 以子类取代类型码
 * @modified: Elijah.D
 */
public class ReplaceTypeCodeWithSubclass {
    public static void main(String[] args) {
        System.out.println("当类型码不会影响宿主类的行为时,可以使用上一章的使用类取代,如果会影响到宿主类的行为,比如" +
                "switch/if-else等根据类型码的值,来决定不同的动作,那么建议使用多态进行重构,使用polymorphism多态" +
                "的前提就是继承体系");
    }
}
