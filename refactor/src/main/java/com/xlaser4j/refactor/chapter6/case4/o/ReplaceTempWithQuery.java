package com.xlaser4j.refactor.chapter6.case4.o;

/**
 * @package: com.xlaser4j.refactor.chapter6.case4.o
 * @author: Elijah.D
 * @time: 2020/3/19 17:35
 * @description:
 * @modified: Elijah.D
 */
public class ReplaceTempWithQuery {
    int quantity;

    int itemPrice;

    double getPrice() {
        int basePrice = quantity * itemPrice;

        double discountFactor;
        if (basePrice > 1000) {
            discountFactor = 0.95;
        } else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
}
