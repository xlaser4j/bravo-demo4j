package com.xlaser4j.refactor.chapter8.case3.o;

import java.util.List;

/**
 * @package: com.xlaser4j.refactor.chapter8.case3.o
 * @author: Elijah.D
 * @time: 2020/3/31 15:58
 * @description:
 * @modified: Elijah.D
 */
public class Order {
    private Customer customer;

    public Order(String customerName) {
        this.customer = new Customer(customerName);
    }

    private static int numberOfOrdersFor(List<Order> orders, String customerName) {
        int result = 0;
        for (Order order : orders) {
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
