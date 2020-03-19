package com.xlaser4j.refactor.chapter6.case1.o;

import java.util.ArrayList;
import java.util.List;

/**
 * @package: com.xlaser4j.refactor.chapter6.case1.o
 * @author: Elijah.D
 * @time: 2020/3/19 16:17
 * @description: Origin-源代码
 * @modified: Elijah.D
 */
public class ExtractMethod {
    private String name;

    private List<Order> orders = new ArrayList<>();

    public void printOwing(double previousAmount) {
        double outstanding = previousAmount * 1.5;

        // print banner
        System.out.println("************************");
        System.out.println("**** Customer Owes ****");
        System.out.println("************************");

        // calculate outstanding
        for (Order order : orders) {
            outstanding += order.getAmount();
        }

        // print details
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }
}
