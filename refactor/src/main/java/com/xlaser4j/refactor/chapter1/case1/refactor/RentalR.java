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
     * <p>
     * Note2: <b>不应该基于Movie的属性数据使用switch,所以把switch相关的逻辑提炼到Movie中</b>
     *
     * @return 价格
     */
    public double getCharge() {
        return movieR.getCharge(rentDays);
    }

    /**
     * 计算一次租赁获取的积分
     * <p>
     * Note: <b>积分的计算设计到的属性也都属于Rental,因此应该放在这</b>
     * <p>
     * Note2: <b>同上,基于Movie的属性数据计算的相关逻辑提炼到Movie中</b>
     *
     * @return 积分
     */
    public int getFrequentRenterPoints() {
        return movieR.getFrequentRenterPoints(rentDays);
    }

    public MovieR getMovieR() {
        return movieR;
    }

    public int getRentDays() {
        return rentDays;
    }
}
