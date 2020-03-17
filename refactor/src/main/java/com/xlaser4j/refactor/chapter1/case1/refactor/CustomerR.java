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
     * Note: <b>Replace Temp With Query: 用查询替换临时变量thisAmount,临时变量往往引发问题,尽量去除;
     * 但是去除可能也会引发性能代价,这里去掉了thisAmount,就需要调用两次获取结果,不过这个问题可以在Rental类中优化.</b>
     *
     * @return result
     */
    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        for (RentalR rental : rentalRs) {
            frequentRenterPoints++;
            if ((rental.getMovieR().getPrice() == MovieR.NEW_RELEASE) && rental.getRentDays() > 1) {
                frequentRenterPoints++;
            }
            result += "\t" + rental.getMovieR().getTitle() + "\t" + rental.getCharge() + "\n";
            totalAmount += rental.getCharge();
        }
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

    public String getName() {
        return name;
    }
}
