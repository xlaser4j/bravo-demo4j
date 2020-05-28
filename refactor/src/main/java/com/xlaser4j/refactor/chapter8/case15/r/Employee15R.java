package com.xlaser4j.refactor.chapter8.case15.r;

/**
 * @package: com.xlaser4j.refactor.chapter8.case15.r
 * @author: Elijah.D
 * @time: 5/20/2020 10:16 AM
 * @description:
 * @modified: Elijah.D
 */
public class Employee15R {
    private EmployeeType15 type;

    private int monthlySalary;

    private int commission;

    private int bonus;

    public Employee15R(int type) {
        setType(type);
    }

    public EmployeeType15 getType() {
        return type;
    }

    public void setType(int type) {
        this.type = EmployeeType15.newType(type);
    }

    int payAmount(int type) {
        switch (type) {
            case EmployeeType15.ENGINEER:
                return monthlySalary;
            case EmployeeType15.SALESMAN:
                return monthlySalary + commission;
            case EmployeeType15.MANAGER:
                return monthlySalary + bonus;
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }
}
