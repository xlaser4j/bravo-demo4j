package com.xlaser4j.refactor.chapter1.case1.refactor.price;

import com.xlaser4j.refactor.chapter1.case1.refactor.MovieR;

/**
 * @package: com.xlaser4j.refactor.chapter1.case1.refactor.price
 * @author: Elijah.D
 * @time: 2020/3/18 15:08
 * @description:
 * @modified: Elijah.D
 */
public class NewReleasePrice extends BasePrice {
    @Override
    public int getPrice() {
        return MovieR.NEW_RELEASE;
    }

    @Override
    public double getCharge(int rentDays) {
        return rentDays * 3.0;
    }

    @Override
    public int getFrequentRenterPoints(int rentDays) {
        return rentDays > 1 ? 2 : 1;
    }
}
