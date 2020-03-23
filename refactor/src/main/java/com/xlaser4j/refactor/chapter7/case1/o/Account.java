package com.xlaser4j.refactor.chapter7.case1.o;

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

    /**
     * 根据账户类型计算透支金额
     *
     * @return money
     */
    double overDraftCharge() {
        if (type.isPremium()) {
            double result = 10;
            if (daysOverDrawn() > 7) {
                result += (daysOverDrawn() - 7) * 0.85;
            }
            return result;
        } else {
            return daysOverDrawn() * 0.75;
        }
    }

    double bankCharge() {
        double result = 4.5;
        if (daysOverDrawn() > 0) {
            result += overDraftCharge();
        }
        return result;
    }

    int daysOverDrawn() {
        return daysOverDrawn++;
    }
}
