package com.xlaser4j.refactor.chapter1.case1.refactor;

import com.xlaser4j.refactor.chapter1.case1.refactor.price.BasePrice;
import com.xlaser4j.refactor.chapter1.case1.refactor.price.ChildrenPrice;
import com.xlaser4j.refactor.chapter1.case1.refactor.price.NewReleasePrice;
import com.xlaser4j.refactor.chapter1.case1.refactor.price.RegularPrice;

/**
 * @package: com.xlaser4j.refactor.chapter1.case1.origin
 * @author: Elijah.D
 * @time: 2020/3/17 14:54
 * @description: 电影CD
 * @modified: Elijah.D
 */
public class MovieR {
    /**
     * 普通类别
     */
    public static final int REGULAR = 0;

    /**
     * 新上映
     */
    public static final int NEW_RELEASE = 1;

    /**
     * 儿童片
     */
    public static final int CHILDREN = 2;

    /**
     * 电影名称
     */
    private String title;

    /**
     * 租赁价格
     * <p>
     * Note: <b>Replace Type Code With State/Strategy</b>
     */
    private BasePrice price;

    /**
     * Note: <b>Replace Type Code With State/Strategy: 关于类型的分支结构可以使用状态/策略模式重构;
     * 而前提就是要对类型的字段使用SelfEncapsulate Field约束,保证通过get/set访问,这里的构造函数中的类型price
     * 也同样修改,不直接访问设置这个类型参数值,也是通过set方法初始化,因为我们会对set方法做一些逻辑操作</b>
     *
     * @param title title
     * @param price price
     */
    public MovieR(String title, int price) {
        this.title = title;
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price.getPrice();
    }

    /**
     * Note: <b>类型字段换成state/strategy而不是使用多态通过继承的方式原因: 一个对象在生命周期内不能修改自己所属的
     * 类,而利用状态模式加入了间接的Price这一层,我们可以在内部进行子类化的动作</b>
     *
     * @param priceCode type
     */
    public void setPrice(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDREN:
                price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    /**
     * 计算每一个租赁的电影花费
     * <p>
     * Note: <b>价格的计算是基于Movie的属性,因此提炼到Movie中</b>
     * <p>
     * Note2: <b>价格类型的改造,使用状态模式解决,因此价格计算也提炼到Price中</b>
     *
     * @param rentDays 租期
     * @return 价格
     */
    public double getCharge(int rentDays) {
        return price.getCharge(rentDays);
    }

    /**
     * 计算一次租赁获取的积分
     * <p>
     * Note: <b>积分的计算设计到的属性属于Movie,因此应该放在这</b>
     * <p>
     * Note: <b>价格类型的改造,使用状态模式解决,因此积分计算也提炼到Price中</b>
     *
     * @param rentDays 租期
     * @return 积分
     */
    public int getFrequentRenterPoints(int rentDays) {
        return price.getFrequentRenterPoints(rentDays);
    }
}
