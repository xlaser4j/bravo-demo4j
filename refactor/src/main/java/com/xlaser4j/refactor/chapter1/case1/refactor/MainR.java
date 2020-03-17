package com.xlaser4j.refactor.chapter1.case1.refactor;

/**
 * @package: com.xlaser4j.refactor.chapter1.case1.origin
 * @author: Elijah.D
 * @time: 2020/3/17 15:38
 * @description:
 * @modified: Elijah.D
 */
public class MainR {
    public static void main(String[] args) {
        CustomerR customer = new CustomerR("Elijah");
        customer.addRental(new RentalR(new MovieR("HarryPotter", MovieR.CHILDREN), 3));
        customer.addRental(new RentalR(new MovieR("Hobbit", MovieR.NEW_RELEASE), 4));
        customer.addRental(new RentalR(new MovieR("Caribbean", MovieR.REGULAR), 1));
        System.out.println(customer.statement());
    }
}
