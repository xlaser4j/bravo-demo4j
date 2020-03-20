package com.xlaser4j.refactor.chapter6.case8.r;

/**
 * @package: com.xlaser4j.refactor.chapter6.case8.o
 * @author: Elijah.D
 * @time: 2020/3/20 16:30
 * @description:
 * @modified: Elijah.D
 */
public class ReplaceMethodWithMethodObjectR {
    /**
     * 利用<b>Replace Method with Method Object: 以函数对象取代函数</b>重构
     *
     * @param inputVal   input
     * @param quantity   quantity
     * @param yearToDate date
     * @return int
     */
    int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    int delta() {
        return 666;
    }

    /**
     * 函数局部变量过多,不能直接Extract Method重构,安装如下方法对象的步骤重构
     * <p>
     * 1.新建一个类,更具待处理函数的用途命名.
     */
    static class Gamma {
        /**
         * 2.类中建立一个final字段保存原函数所在的对象,同时针对原函数的参数以及涉及的临时变量建立字段保存
         */
        private final ReplaceMethodWithMethodObjectR source;

        private int inputVal;

        private int quantity;

        private int yearToDate;

        private int importantValue1;

        private int importantValue2;

        private int importantValue3;

        /**
         * 3.类中建立一个构造函数,接受源对象及原函数的所有参数作为构造参数
         *
         * @param source     源对象
         * @param inputVal   param1
         * @param quantity   param2
         * @param yearToDate param3
         */
        public Gamma(ReplaceMethodWithMethodObjectR source, int inputVal, int quantity, int yearToDate) {
            this.source = source;
            this.inputVal = inputVal;
            this.quantity = quantity;
            this.yearToDate = yearToDate;
        }

        /**
         * 4.类中建立一个compute函数,将原函数复制到这个函数中;函数中的变量参数用类中的字段代替,如果有任何调用
         * 源对象的函数eg: {@link ReplaceMethodWithMethodObjectR#delta()},同样换成用源对象字段调用
         * <p>
         * 5.替换原函数的调用为这个类对象调用compute方法: new Gamma(this, param1, param2, ...).compute()
         *
         * @return int
         */
        int compute() {
            importantValue1 = (inputVal * quantity) + source.delta();
            importantValue2 = (inputVal * yearToDate) + 100;
            importantThing();
            importantValue3 = importantValue2 * 7;
            return importantValue3 - (2 * importantValue1);
        }

        private void importantThing() {
            if ((yearToDate - importantValue1) > 100) {
                importantValue2 -= 20;
            }
        }
    }
}
