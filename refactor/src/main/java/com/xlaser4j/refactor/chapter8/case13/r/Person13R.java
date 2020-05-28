package com.xlaser4j.refactor.chapter8.case13.r;

/**
 * @package: com.xlaser4j.refactor.chapter8.case13.o
 * @author: Elijah.D
 * @time: 5/19/2020 10:06 AM
 * @description:
 * @modified: Elijah.D
 */
public class Person13R {
    private BloodGroup bloodGroup;

    public Person13R(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getBloodGroupCode() {
        return bloodGroup.getCode();
    }

    public void doSomethingR() {
        Person13R person = new Person13R(BloodGroup.A);
        person.getBloodGroup().getCode();
        person.setBloodGroup(BloodGroup.AB);
    }
}
