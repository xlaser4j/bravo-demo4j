package com.xlaser4j.refactor.chapter7.case2.o;

/**
 * @package: com.xlaser4j.refactor.chapter7.case1.o
 * @author: Elijah.D
 * @time: 2020/3/23 10:43
 * @description:
 * @modified: Elijah.D
 */
public class Account {
    private AccountType type;

    private int daysOverDrawn;

    private double interestRate;

    double interestForAmountDays(double amount, int days) {
        return interestRate * amount * days / 365;
    }
}
