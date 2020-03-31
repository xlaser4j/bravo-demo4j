package com.xlaser4j.refactor.chapter8.case1.o;

/**
 * @package: com.xlaser4j.refactor.chapter8.case1.o
 * @author: Elijah.D
 * @time: 2020/3/31 15:31
 * @description: 范围排名
 * @modified: Elijah.D
 */
public class IntRange {
    private int low;

    private int high;

    public IntRange(int low, int high) {
        this.low = low;
        this.high = high;
    }

    boolean includes(int arg) {
        return arg >= low && arg <= high;
    }

    void grow(int factor) {
        high = high * factor;
    }
}
