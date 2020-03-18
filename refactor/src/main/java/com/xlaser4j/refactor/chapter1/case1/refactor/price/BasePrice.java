package com.xlaser4j.refactor.chapter1.case1.refactor.price;

/**
 * @package: com.xlaser4j.refactor.chapter1.case1.refactor.price
 * @author: Elijah.D
 * @time: 2020/3/18 14:59
 * @description: 抽象父类, 状态模式
 * @modified: Elijah.D
 */
public abstract class BasePrice {
    /**
     * 获取价格类型
     * <p>
     * Note: <b>Replace Conditional with Polymorphism利用多态代替分支</b>
     *
     * @return price
     */
    public abstract int getPrice();

    /**
     * 计算每一个租赁的电影花费
     *
     * @param rentDays 租期
     * @return 价格
     */
    public abstract double getCharge(int rentDays);

    /**
     * 计算一次租赁获取的积分
     * <p>
     * 这里不作为一个抽象方法,因为只有new_release是特殊可能返回2,所以让new_release重写即可
     *
     * @param rentDays 租期
     * @return 积分
     */
    public int getFrequentRenterPoints(int rentDays) {
        return 1;
    }
}
