package com.xlaser4j.refactor.chapter6.case2;

/**
 * @package: com.xlaser4j.refactor.chapter6.case2.o
 * @author: Elijah.D
 * @time: 2020/3/19 17:05
 * @description:
 * @modified: Elijah.D
 */
public class InlineMethod {
    private int numberOfLateDeliveries;

    int getRating() {
        return moreThanFiveLateDeliveries() ? 2 : 1;
    }

    boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5;
    }

    class InlineMethodR {
        /**
         * 利用<b>Inline Method(内联函数)</b>进行重构
         * <p>
         * 间接层很有用,但是太多的间接层造成难以理解,尤其是简单的委托调用,这种本身就清晰可读的间接层可以使用内联函数重构
         *
         * @return int
         */
        int getRating() {
            return numberOfLateDeliveries > 5 ? 2 : 1;
        }
    }
}
