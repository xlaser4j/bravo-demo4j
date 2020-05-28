package com.xlaser4j.refactor.chapter8.case14.r;

/**
 * @package: com.xlaser4j.refactor.chapter8.case14.o
 * @author: Elijah.D
 * @time: 5/20/2020 10:16 AM
 * @description:
 * @modified: Elijah.D
 */
public abstract class Employee14R {
    static final int ENGINEER = 0;

    static final int SALESMAN = 1;

    static final int MANAGER = 2;

    static Employee14R create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }

    abstract int getType();
}
