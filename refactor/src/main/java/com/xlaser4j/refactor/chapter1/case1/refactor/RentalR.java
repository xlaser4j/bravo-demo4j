package com.xlaser4j.refactor.chapter1.case1.refactor;

/**
 * @package: com.xlaser4j.refactor.chapter1.case1.origin
 * @author: Elijah.D
 * @time: 2020/3/17 14:57
 * @description: 租赁
 * @modified: Elijah.D
 */
public class RentalR {
    /**
     * CD
     */
    private MovieR movieR;

    /**
     * 租赁天数
     */
    private int rentDays;

    public RentalR(MovieR movieR, int rentDays) {
        this.movieR = movieR;
        this.rentDays = rentDays;
    }

    /**
     * 计算每一个租赁的电影花费
     * <p>
     * Note: <b>计算价格的方法,不应该放在customer类中,应该放置在相关类中</b>
     *
     * @return amount
     */
    public double getCharge() {
        double thisAmount = 0;
        switch (getMovieR().getPrice()) {
            case MovieR.REGULAR:
                thisAmount += 2;
                if (getRentDays() > 2) {
                    thisAmount += (getRentDays() - 2) * 1.5;
                }
                break;
            case MovieR.NEW_RELEASE:
                thisAmount += getRentDays() * 3;
                break;
            case MovieR.CHILDREN:
                thisAmount += 1.5;
                if (getRentDays() > 3) {
                    thisAmount += (getRentDays() - 3) * 1.5;
                }
                break;
            default:
        }
        return thisAmount;
    }

    public MovieR getMovieR() {
        return movieR;
    }

    public int getRentDays() {
        return rentDays;
    }
}
