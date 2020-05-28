package com.xlaser4j.refactor.chapter8.case13.o;

/**
 * @package: com.xlaser4j.refactor.chapter8.case13.o
 * @author: Elijah.D
 * @time: 5/19/2020 10:06 AM
 * @description:
 * @modified: Elijah.D
 */
public class Person13 {
    public static final int O = 0;

    public static final int A = 1;

    public static final int B = 2;

    public static final int AB = 3;

    private int bloodGroup;

    public Person13(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void doSomething() {
        Person13 person13 = new Person13(Person13.A);
        person13.getBloodGroup();
        person13.setBloodGroup(Person13.AB);
    }
}
