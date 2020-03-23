package com.xlaser4j.refactor.chapter7.case3.o;

/**
 * @package: com.xlaser4j.refactor.chapter7.case3.o
 * @author: Elijah.D
 * @time: 2020/3/23 13:48
 * @description:
 * @modified: Elijah.D
 */
public class Person {
    private String name;

    private String officeAreaCode;

    private String officeNumber;

    public String getTelephoneNumber() {
        return "(" + officeAreaCode + ")" + officeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
