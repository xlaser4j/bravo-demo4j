package com.xlaser4j.refactor.chapter1.case1.refactor;

import java.util.ArrayList;
import java.util.List;

/**
 * @package: com.xlaser4j.refactor.chapter1.case1.origin
 * @author: Elijah.D
 * @time: 2020/3/17 14:59
 * @description: 租客
 * @modified: Elijah.D
 */
public class CustomerR {
    /**
     * 租客名
     */
    private String name;

    /**
     * 租客租赁信息
     */
    private List<RentalR> rentalRs;

    public CustomerR(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(RentalR rentalR) {
        if (rentalRs == null || rentalRs.isEmpty()) {
            rentalRs = new ArrayList<>();
        }
        rentalRs.add(rentalR);
    }

    /**
     * Note: <b>方法过长,分解重组statement方法,代码块越小,功能就越容易理解,代码的处理和移动也就越方便.</b>
     * <p>
     * Note: <b>Extract Method: 提炼出getCharge方法,并且放到使用数据的对象内,也即是Rental,同时去掉rental参数,通过this获取信息.</b>
     * <p>
     * Note: <b>Replace Temp With Query: 用查询替换临时变量thisAmount,临时变量往往引发问题,助长了冗长复杂的行数,应该尽量去除;
     * 但是去除可能也会引发性能代价,这里去掉了thisAmount,就需要调用两次获取结果,不过这个问题可以在Rental类中优化.</b>
     * <p>
     * Note: <b>Extract Method: 关于积分的计算,应该提取到Rental中去,注意idea中的提取方法如下,带有临时变量以及局部变量
     * getFrequentRenterPoints(int frequentRenterPoints, RentalR rental),而局部变量随着移动到Rental中消失
     * 而临时变量frequentRenterPoints,每次计算前都有一个初始值,我们可以不传参直接累加即可</b>
     * <p>
     * Note: <b>Replace Temp With Query: 同样是临时变量的处理totalAmount,frequentRenterPoints;因为在循环中
     * 所以需要在循环中处理(重复的代码后续可以通过Form Template Method重构清除)</b>
     *
     * @return result
     */
    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for (RentalR rental : rentalRs) {
            result += "\t" + rental.getMovieR().getTitle() + "\t" + rental.getCharge() + "\n";
        }
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    /**
     * 临时变量处理,通过query实现,同时应该放在Customer类中
     *
     * @return 总的价格
     */
    private double getTotalCharge() {
        double totalAmount = 0;
        for (RentalR rental : rentalRs) {
            totalAmount += rental.getCharge();
        }
        return totalAmount;
    }

    /**
     * 临时变量处理,通过query实现,同时应该放在Customer类中
     *
     * @return 总的积分
     */
    private double getTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (RentalR rental : rentalRs) {
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }
}
