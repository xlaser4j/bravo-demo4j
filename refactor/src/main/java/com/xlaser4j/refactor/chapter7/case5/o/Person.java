package com.xlaser4j.refactor.chapter7.case5.o;

/**
 * @package: com.xlaser4j.refactor.chapter7.case5.o
 * @author: Elijah.D
 * @time: 2020/3/23 14:31
 * @description:
 * @modified: Elijah.D
 */
public class Person {
    private String name;

    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // 需要获取某人的manager时: elijah.getDepartment().getManager()
}
