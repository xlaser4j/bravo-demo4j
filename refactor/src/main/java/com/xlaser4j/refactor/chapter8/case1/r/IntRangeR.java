package com.xlaser4j.refactor.chapter8.case1.r;

/**
 * @package: com.xlaser4j.refactor.chapter8.case1.o
 * @author: Elijah.D
 * @time: 2020/3/31 15:31
 * @description:
 * @modified: Elijah.D
 */
public class IntRangeR {
    private int low;

    private int high;

    public IntRangeR(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    boolean includes(int arg) {
        return arg >= getLow() && arg <= getHigh();
    }

    void grow(int factor) {
        setHigh(getHigh() * factor);
    }
}
