package com.xlaser4j.refactor.chapter8.case2.r;

import java.util.List;

/**
 * @package: com.xlaser4j.refactor.chapter8.case2.o
 * @author: Elijah.D
 * @time: 2020/3/31 15:58
 * @description:
 * @modified: Elijah.D
 */
public class OrderR {
    private Customer customer;

    public OrderR(String customerName) {
        this.customer = new Customer(customerName);
    }

    private static int numberOfOrdersFor(List<OrderR> orders, String customerName) {
        int result = 0;
        for (OrderR order : orders) {
            if (order.getCustomerName().equals(customerName)) {
                result++;
            }
        }
        return result;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void setCustomer(String customerName) {
        this.customer = new Customer(customerName);
    }
}
