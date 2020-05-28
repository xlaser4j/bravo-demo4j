package com.xlaser4j.refactor.chapter8.case15.r;

/**
 * @package: com.xlaser4j.refactor.chapter8.case15.r
 * @author: Elijah.D
 * @time: 5/20/2020 10:16 AM
 * @description:
 * @modified: Elijah.D
 */
public abstract class EmployeeType15 {
    static final int ENGINEER = 0;

    static final int SALESMAN = 1;

    static final int MANAGER = 2;

    static EmployeeType15 newType(int arg) {
        switch (arg) {
            case ENGINEER:
                return new Engineer15();
            case SALESMAN:
                return new Salesman15();
            case MANAGER:
                return new Manager15();
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }

    abstract int getType();
}
