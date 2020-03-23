package com.xlaser4j.refactor.chapter7.case4.r;

/**
 * @package: com.xlaser4j.refactor.chapter7.case3.o
 * @author: Elijah.D
 * @time: 2020/3/23 13:48
 * @description:
 * @modified: Elijah.D
 */
public class PersonR {
    private String name;

    private String areaCode;

    private String number;

    public String getTelephoneNumber() {
        return "(" + areaCode + ")" + number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
