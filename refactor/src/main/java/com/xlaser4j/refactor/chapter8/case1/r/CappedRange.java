package com.xlaser4j.refactor.chapter8.case1.r;

/**
 * @package: com.xlaser4j.refactor.chapter8.case1.r
 * @author: Elijah.D
 * @time: 2020/3/31 15:40
 * @description: 排名限制
 * @modified: Elijah.D
 */
public class CappedRange extends IntRangeR {
    private int cap;

    public CappedRange(int low, int high, int cap) {
        super(low, high);
        this.cap = cap;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    /**
     * 方便子类复写
     *
     * @return 范围
     */
    @Override
    public int getHigh() {
        return Math.min(super.getHigh(), getCap());
    }
}
