package com.xlaser4j.refactor.chapter8.case5.o;

/**
 * @package: com.xlaser4j.refactor.chapter8.case5.o
 * @author: Elijah.D
 * @time: 2020/4/3 17:01
 * @description:
 * @modified: Elijah.D
 */
public class Client {
    public void useArray() {
        String[] row = new String[3];
        row[0] = "Name";
        row[1] = "5";

        String name = row[0];
        int wins = Integer.parseInt(row[1]);
    }
}
