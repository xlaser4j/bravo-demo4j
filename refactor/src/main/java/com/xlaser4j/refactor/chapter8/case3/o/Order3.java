package com.xlaser4j.refactor.chapter8.case3.o;

import java.util.List;

/**
 * @package: com.xlaser4j.refactor.chapter8.case3.o
 * @author: Elijah.D
 * @time: 2020/3/31 15:58
 * @description:
 * @modified: Elijah.D
 */
public class Order3 {
    private Customer3 customer3;

    public Order3(String customerName) {
        this.customer3 = new Customer3(customerName);
    }

    private static int numberOfOrdersFor(List<Order3> order3s, String customerName) {
        int result = 0;
        for (Order3 order3 : order3s) {
            if (order3.getCustomerName().equals(customerName)) {
                result++;
            }
        }
        return result;
    }

    public String getCustomerName() {
        return customer3.getName();
    }

    public void setCustomer3(String customerName) {
        this.customer3 = new Customer3(customerName);
    }
}
