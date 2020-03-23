package com.xlaser4j.refactor.chapter7.case1.r;

/**
 * @package: com.xlaser4j.refactor.chapter7.case1.o
 * @author: Elijah.D
 * @time: 2020/3/23 10:42
 * @description:
 * @modified: Elijah.D
 */
public class AccountTypeR {
    private boolean premium;

    public boolean isPremium() {
        return premium;
    }

    double overDraftCharge(AccountR account) {
        if (isPremium()) {
            double result = 10;
            if (account.daysOverDrawn() > 7) {
                result += (account.daysOverDrawn() - 7) * 0.85;
            }
            return result;
        } else {
            return account.daysOverDrawn() * 0.75;
        }
    }
}
