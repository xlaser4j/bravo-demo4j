package com.xlaser4j.refactor.chapter7.case1.r;

/**
 * @package: com.xlaser4j.refactor.chapter7.case1.o
 * @author: Elijah.D
 * @time: 2020/3/23 10:43
 * @description:
 * @modified: Elijah.D
 */
public class AccountR {
    private AccountTypeR type;

    private int daysOverDrawn;

    /**
     * Note: 利用<b>MoveMethod: 移动函数</b>重构
     * <p>
     * overDraft是根据账户类型计算透支额度,为了使其职责更加清晰,可以移到账户类型中,因为调用了源类中的其他函数,
     * 所以传递类引用作为参数;如果没有引用其他函数,可以视情况而定,传递个别参数.
     *
     * @return
     */
    double overDraftCharge() {
        return type.overDraftCharge(this);
    }

    /**
     * 删除旧函数,这里替换成type调用即可
     *
     * @return
     */
    double bankCharge() {
        double result = 4.5;
        if (daysOverDrawn() > 0) {
            result += type.overDraftCharge(this);
        }
        return result;
    }

    int daysOverDrawn() {
        return daysOverDrawn++;
    }
}
