package com.xlaser4j.refactor.chapter8.case15.o;

/**
 * @package: com.xlaser4j.refactor.chapter8.case15.o
 * @author: Elijah.D
 * @time: 5/20/2020 10:16 AM
 * @description:
 * @modified: Elijah.D
 */
public class Employee15 {
    static final int ENGINEER = 0;

    static final int SALESMAN = 1;

    static final int MANAGER = 2;

    private int type;

    private int monthlySalary;

    private int commission;

    private int bonus;

    public Employee15(int type) {
        this.type = type;
    }

    int payAmount(int type) {
        switch (type) {
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commission;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }
}
