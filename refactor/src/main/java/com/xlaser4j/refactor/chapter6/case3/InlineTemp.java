package com.xlaser4j.refactor.chapter6.case3;

/**
 * @package: com.xlaser4j.refactor.chapter6.case3
 * @author: Elijah.D
 * @time: 2020/3/19 17:14
 * @description:
 * @modified: Elijah.D
 */
public class InlineTemp {
    /**
     * 假设<code>Math.random()</code>是一个函数: anOrder.basePrice()
     *
     * @return true
     */
    boolean isBase() {
        double basePrice = Math.random();
        return basePrice > 100;
    }

    class InlineTempR {
        /**
         * 利用<b>Inline Temp(内联临时变量)</b>进行重构
         * <p>
         * 内联临时变量多半是作为Replace Temp with Query使用,如果不是那就是上述的那种作为函数的返回值;注意通常
         * 这样的临时也可以接受,但是如果进行如Extract Method的重构时,需要把它内联化.
         *
         * @return true
         */
        boolean isBase() {
            return Math.random() > 100;
        }
    }
}
