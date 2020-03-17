package com.xlaser4j.refactor.chapter1.case1.origin;

/**
 * 现在是打印字符串报表,如果需要打印html报表,就需要复制statement方法额外实现,代码重复且维护困难:
 * 当发现为程序添加一个特性时,如果不是很方便就需要进行重构,重构之前需要测试机制保证重构的正确性,避免引入新的bug
 *
 * @package: com.xlaser4j.refactor.chapter1.case1.origin
 * @author: Elijah.D
 * @time: 2020/3/17 15:38
 * @description:
 * @modified: Elijah.D
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Elijah");
        customer.addRental(new Rental(new Movie("HarryPotter", Movie.CHILDREN), 3));
        customer.addRental(new Rental(new Movie("Hobbit", Movie.NEW_RELEASE), 4));
        customer.addRental(new Rental(new Movie("Caribbean", Movie.REGULAR), 1));
        System.out.println(customer.statement());
    }
}
