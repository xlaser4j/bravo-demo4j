package com.xlaser4j.refactor.chapter6.case4.r;

/**
 * @package: com.xlaser4j.refactor.chapter6.case4
 * @author: Elijah.D
 * @time: 2020/3/19 17:35
 * @description:
 * @modified: Elijah.D
 */
public class ReplaceTempWithQueryR {
    int quantity;

    int itemPrice;

    /**
     * 利用<b>Replace Temp With Query: 以查询取代临时变量</b>重构.
     * <p>
     * 取代之前先声明为final确保变量只被复制一次,减少替换风险:
     * <pre>
     * final int basePrice = quantity * itemPrice;
     * final double discountFactor;
     * </pre>
     * <b>运用这种重构手法,会引发多次调用,尤其是循环的情况,而担心性能问题;但实际上可以不必理会,因为十有八九不会造
     * 成性能问题,若是真出了性能问题,可以在优化时期解决,而由于重构的良好组织,可以找到良好的优化方法,后续章节讨论,
     * 最差的结果是没有好的优化方案,而且性能问题堪忧,那也很容易把临时变量还原</b>
     *
     * @return price
     */
    double getPrice() {
        return basePrice() * discountFactor();
    }

    /**
     * Note: <b>用query方法取代临时变量,最后把basePrice这个临时变量换成内联而消除</b>
     * <p>
     * 同时这一步替换看似没必要,但实际上影响了下一步的重构,因为如果没有这里的提取方法,后面的discount提炼将难以提炼
     *
     * @return price
     */
    private int basePrice() {
        return quantity * itemPrice;
    }

    /**
     * Note: <b>用query方法取代临时变量,最后把discountFactor这个临时变量换成内联而消除</b>
     * <p>
     * 注意basePrice提炼的作用,降低了这里的重构难度
     *
     * @return discount
     */
    private double discountFactor() {
        if (basePrice() > 1000) {
            return 0.95;
        } else {
            return 0.98;
        }
    }
}
