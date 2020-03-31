package com.xlaser4j.refactor.chapter8.case2.o;

import java.util.List;

/**
 * @package: com.xlaser4j.refactor.chapter8.case2.o
 * @author: Elijah.D
 * @time: 2020/3/31 15:58
 * @description:
 * @modified: Elijah.D
 */
public class Order {
    private String customer;

    public Order(String customer) {
        this.customer = customer;
    }

    private static int numberOfOrdersFor(List<Order> orders, String customer) {
        int result = 0;
        for (Order order : orders) {
            if (order.getCustomer().equals(customer)) {
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
