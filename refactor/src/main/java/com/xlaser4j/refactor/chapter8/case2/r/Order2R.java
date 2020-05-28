package com.xlaser4j.refactor.chapter8.case2.r;

import java.util.List;

/**
 * @package: com.xlaser4j.refactor.chapter8.case2.o
 * @author: Elijah.D
 * @time: 2020/3/31 15:58
 * @description:
 * @modified: Elijah.D
 */
public class Order2R {
    private Customer2R customer2R;

    public Order2R(String customerName) {
        this.customer2R = new Customer2R(customerName);
    }

    private static int numberOfOrdersFor(List<Order2R> orders, String customerName) {
        int result = 0;
        for (Order2R order : orders) {
            if (order.getCustomerName().equals(customerName)) {
                result++;
            }
        }
        return result;
    }

    public String getCustomerName() {
        return customer2R.getName();
    }

    public void setCustomer2R(String customerName) {
        this.customer2R = new Customer2R(customerName);
    }
}
