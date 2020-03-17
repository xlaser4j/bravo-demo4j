package com.xlaser4j.refactor.chapter1.case1.origin;

import java.util.ArrayList;
import java.util.List;

/**
 * @package: com.xlaser4j.refactor.chapter1.case1.origin
 * @author: Elijah.D
 * @time: 2020/3/17 14:59
 * @description: 租客
 * @modified: Elijah.D
 */
public class Customer {
    /**
     * 租客名
     */
    private String name;

    /**
     * 租客租赁信息
     */
    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        if (rentals == null || rentals.isEmpty()) {
            rentals = new ArrayList<>();
        }
        rentals.add(rental);
    }

    /**
     * 打印租赁报表
     *
     * @return result
     */
    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        for (Rental rental : rentals) {
            double thisAmount = 0;

            // 计算每一个租赁的电影花费
            switch (rental.getMovie().getPrice()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (rental.getRentDays() > 2) {
                        thisAmount += (rental.getRentDays() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += rental.getRentDays() * 3;
                    break;
                case Movie.CHILDREN:
                    thisAmount += 1.5;
                    if (rental.getRentDays() > 3) {
                        thisAmount += (rental.getRentDays() - 3) * 1.5;
                    }
                    break;
                default:
            }
            // 每租一次累计积分
            frequentRenterPoints++;

            // add bonus for a two day new release rental
            if ((rental.getMovie().getPrice() == Movie.NEW_RELEASE) && rental.getRentDays() > 1) {
                frequentRenterPoints++;
            }
            // show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;
        }
        // add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

    public String getName() {
        return name;
    }
}
