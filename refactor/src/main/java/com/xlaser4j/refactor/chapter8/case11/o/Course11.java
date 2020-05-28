package com.xlaser4j.refactor.chapter8.case11.o;

/**
 * @package: com.xlaser4j.refactor.chapter8.case11.o
 * @author: Elijah.D
 * @time: 5/18/2020 6:23 PM
 * @description:
 * @modified: Elijah.D
 */
public class Course11 {
    private String name;

    private Boolean advanced;

    public Course11(String name, Boolean advanced) {
        this.name = name;
        this.advanced = advanced;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
