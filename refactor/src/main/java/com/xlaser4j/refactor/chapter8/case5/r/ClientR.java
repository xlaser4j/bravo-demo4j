package com.xlaser4j.refactor.chapter8.case5.r;

/**
 * @package: com.xlaser4j.refactor.chapter8.case5.o
 * @author: Elijah.D
 * @time: 2020/4/3 17:01
 * @description:
 * @modified: Elijah.D
 */
public class ClientR {
    public void useArray() {
        Performance_1 row = new Performance_1();
        row.setName("Name");
        row.setWins("5");

        String name = row.getName();
        int wins = row.getWins();
    }
}
