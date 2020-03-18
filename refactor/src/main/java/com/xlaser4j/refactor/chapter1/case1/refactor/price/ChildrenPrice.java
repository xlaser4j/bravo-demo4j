package com.xlaser4j.refactor.chapter1.case1.refactor.price;

import com.xlaser4j.refactor.chapter1.case1.refactor.MovieR;

/**
 * @package: com.xlaser4j.refactor.chapter1.case1.refactor.price
 * @author: Elijah.D
 * @time: 2020/3/18 15:03
 * @description:
 * @modified: Elijah.D
 */
public class ChildrenPrice extends BasePrice {
    @Override
    public int getPrice() {
        return MovieR.CHILDREN;
    }

    @Override
    public double getCharge(int rentDays) {
        double thisAmount = 1.5;
        if (rentDays > 3) {
            thisAmount += (rentDays - 3) * 1.5;
        }
        return thisAmount;
    }
}
