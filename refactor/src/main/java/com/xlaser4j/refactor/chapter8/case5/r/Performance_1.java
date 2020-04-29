package com.xlaser4j.refactor.chapter8.case5.r;

/**
 * @package: com.xlaser4j.refactor.chapter8.case5.r
 * @author: Elijah.D
 * @time: 2020/4/3 17:03
 * @description:
 * @modified: Elijah.D
 */
public class Performance_1 {
    private String[] data = new String[3];

    public String getName() {
        return data[0];
    }

    public String setName(String name) {
        return data[0] = name;
    }

    public Integer getWins() {
        return Integer.parseInt(data[1]);
    }

    public String setWins(String winNumber) {
        return data[2] = winNumber;
    }
}
