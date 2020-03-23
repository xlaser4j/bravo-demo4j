package com.xlaser4j.refactor.chapter7.case4.o;

/**
 * @package: com.xlaser4j.refactor.chapter7.case3.r
 * @author: Elijah.D
 * @time: 2020/3/23 13:53
 * @description:
 * @modified: Elijah.D
 */
public class Telephone {
    private String areaCode;

    private String number;

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

    public String getTelephoneNumber() {
        return "(" + areaCode + ")" + number;
    }
}
