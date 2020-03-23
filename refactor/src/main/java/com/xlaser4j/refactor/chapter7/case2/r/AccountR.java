package com.xlaser4j.refactor.chapter7.case2.r;

import com.xlaser4j.refactor.chapter7.case2.o.AccountType;

/**
 * The type Account r.
 *
 * @package: com.xlaser4j.refactor.chapter7.case2.o
 * @author: Elijah.D
 * @time: 2020 /3/23 10:43
 * @description:
 * @modified: Elijah.D
 */
public class AccountR {
    private AccountType type;

    private int daysOverDrawn;

    public double getInterestRate() {
        return type.getInterestRate();
    }

    public void setInterestRate(double interestRate) {
        type.setInterestRate(interestRate);
    }

    /**
     * Note: 利用<b>Move Field: 搬移字段</b>重构
     * <p>
     * 这里的利率字段移到type中去,如果是该字段在源函数引用不多,可以直接直接移过去,然后源函数改成type调用即可
     * <p>
     * 如果引用很多,使用:<b>SelfEncapsulateField自我封装之后再移动处理,这样源函数只需要改动getter/setter方法</b>
     *
     * @param amount amount
     * @param days   days
     * @return double
     */
    double interestForAmountDays(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }
}
