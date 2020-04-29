package com.xlaser4j.refactor.chapter8.case7.r;

import java.util.Set;

/**
 * @package: com.xlaser4j.refactor.chapter8.case7.r
 * @author: Elijah.D
 * @time: 2020/4/3 17:44
 * @description:
 * @modified: Elijah.D
 */
public class CustomerR {
    private Set<OrderR> orders;

    Set<OrderR> listOrders() {
        return orders;
    }

    void addOrder(OrderR order) {
        order.setCustomerR(this);
    }
}
