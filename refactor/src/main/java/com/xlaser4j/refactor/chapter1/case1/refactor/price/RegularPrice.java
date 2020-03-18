package com.xlaser4j.refactor.chapter1.case1.refactor.price;

import com.xlaser4j.refactor.chapter1.case1.refactor.MovieR;

/**
 * @package: com.xlaser4j.refactor.chapter1.case1.refactor.price
 * @author: Elijah.D
 * @time: 2020/3/18 15:08
 * @description:
 * @modified: Elijah.D
 */
public class RegularPrice extends BasePrice {
    @Override
    public int getPrice() {
        return MovieR.REGULAR;
    }

    @Override
    public double getCharge(int rentDays) {
        double thisAmount = 2;
        if (rentDays > 2) {
            thisAmount += (rentDays - 2) * 1.5;
        }
        return thisAmount;
    }
}
