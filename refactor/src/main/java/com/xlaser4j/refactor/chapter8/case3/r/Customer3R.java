package com.xlaser4j.refactor.chapter8.case3.r;

import java.util.HashMap;

/**
 * @package: com.xlaser4j.refactor.chapter8.case3.r
 * @author: Elijah.D
 * @time: 2020/3/31 16:01
 * @description:
 * @modified: Elijah.D
 */
public class Customer3R {
    private static HashMap<String, Customer3R> instances = new HashMap<>();

    private String name;

    private Customer3R(String name) {
        this.name = name;
    }

    static void loadCustomers() {
        new Customer3R("Customer-1").store();
        new Customer3R("Customer-2").store();
        new Customer3R("Customer-3").store();
    }

    public static Customer3R getByName(String name) {
        return instances.get(name);
    }

    private void store() {
        instances.put(this.getName(), this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
