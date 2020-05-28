package com.xlaser4j.refactor.chapter8.case7.r;

import java.util.Set;

/**
 * @package: com.xlaser4j.refactor.chapter8.case7.r
 * @author: Elijah.D
 * @time: 2020/4/3 17:44
 * @description:
 * @modified: Elijah.D
 */
public class Customer7R {
    private Set<Order7R> orders;

    Set<Order7R> listOrders() {
        return orders;
    }

    void addOrder(Order7R order) {
        order.setCustomerR(this);
    }
}
