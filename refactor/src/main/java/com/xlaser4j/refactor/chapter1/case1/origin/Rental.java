package com.xlaser4j.refactor.chapter1.case1.origin;

/**
 * @package: com.xlaser4j.refactor.chapter1.case1.origin
 * @author: Elijah.D
 * @time: 2020/3/17 14:57
 * @description: 租赁
 * @modified: Elijah.D
 */
public class Rental {
    /**
     * CD
     */
    private Movie movie;

    /**
     * 租赁天数
     */
    private int rentDays;

    public Rental(Movie movie, int rentDays) {
        this.movie = movie;
        this.rentDays = rentDays;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getRentDays() {
        return rentDays;
    }
}
