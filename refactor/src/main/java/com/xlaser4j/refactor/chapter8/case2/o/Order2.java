package com.xlaser4j.refactor.chapter8.case2.o;

import java.util.List;

/**
 * @package: com.xlaser4j.refactor.chapter8.case2.o
 * @author: Elijah.D
 * @time: 2020/3/31 15:58
 * @description:
 * @modified: Elijah.D
 */
public class Order2 {
    private String customer;

    public Order2(String customer) {
        this.customer = customer;
    }

    private static int numberOfOrdersFor(List<Order2> order2s, String customer) {
        int result = 0;
        for (Order2 order2 : order2s) {
            if (order2.getCustomer().equals(customer)) {
                result++;
            }
        }
        return result;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
