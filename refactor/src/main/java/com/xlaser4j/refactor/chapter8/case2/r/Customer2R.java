package com.xlaser4j.refactor.chapter8.case2.r;

/**
 * @package: com.xlaser4j.refactor.chapter8.case2.r
 * @author: Elijah.D
 * @time: 2020/3/31 16:01
 * @description:
 * @modified: Elijah.D
 */
public class Customer2R {
    private String name;

    public Customer2R(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
