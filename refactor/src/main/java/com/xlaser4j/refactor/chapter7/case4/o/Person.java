package com.xlaser4j.refactor.chapter7.case4.o;

/**
 * @package: com.xlaser4j.refactor.chapter7.case3.o
 * @author: Elijah.D
 * @time: 2020/3/23 13:48
 * @description:
 * @modified: Elijah.D
 */
public class Person {
    private String name;

    private Telephone telephone;

    public String getTelephoneNumber() {
        return telephone.getTelephoneNumber();
    }

    public Telephone getTelephone() {
        return telephone;
    }
}
