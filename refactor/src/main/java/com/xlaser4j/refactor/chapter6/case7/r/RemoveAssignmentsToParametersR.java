package com.xlaser4j.refactor.chapter6.case7.r;

import java.util.Date;

/**
 * @package: com.xlaser4j.refactor.chapter6.case7.o
 * @author: Elijah.D
 * @time: 2020/3/20 15:23
 * @description:
 * @modified: Elijah.D
 */
public class RemoveAssignmentsToParametersR {
    /**
     * 利用<b>Remove Assignments to Parameters: 去除对参数的赋值</b>重构
     * <p>
     * 这里只是一个简单的case,严格意义上这种重构手法是针对对象参数的重新赋值而言,如下的日期方法,对日期参数赋值并不会
     * 改变参数的值,容易造成误解而且清晰度降低;因此在java中不要对参数赋值
     * <p>
     * 可以在参数上添加final关键字,就像函数方法中的变量加final修饰一样,但是通常不这么做,只有较长函数的内部变量使用
     * final,帮助我们检查是否做了修改
     *
     * @param inputVal   input
     * @param quantity   quantity
     * @param yearToDate date
     * @return discount
     */
    public int discount(final int inputVal, int quantity, int yearToDate) {
        int result = inputVal;
        if (inputVal > 50) {
            result -= 2;
        }
        if (quantity > 100) {
            result -= 1;
        }
        if (yearToDate > 1000) {
            result -= 4;
        }

        return result;
    }

    /**
     * java严格按值传递,对象的引用也是按值传递,因此可以修改对象的内部状态,但是对参数赋值是没有意义的
     */
    static class Param {
        public static void main(String[] args) {
            int x = 5;
            tripe(x);
            System.out.println("==================== x after triple: " + x + "====================\n");

            Date d1 = new Date();
            nextDateUpdate(d1);
            System.out.println("==================== d1 after nextDay: " + d1 + "====================\n");

            Date d2 = new Date();
            nextDateReplace(d2);
            System.out.println("==================== d2 after nextDay: " + d2 + "====================\n");
        }

        /**
         * 基本类型: x的值并未改变,能理解
         *
         * @param arg x
         */
        private static void tripe(int arg) {
            arg = arg * 3;
            System.out.println("arg in triple: " + arg);
        }

        /**
         * 对象类型: 这里对象的引用也是按值传递的,所以我们可以更新参数,也即是更新对象
         *
         * @param arg object
         */
        private static void nextDateUpdate(Date arg) {
            arg.setDate(arg.getDate() + 1);
            System.out.println("arg in nextDateUpdate: " + arg);
        }

        /**
         * 对象类型: 这里对象的引用也是按值传递的,这里对对象进行了重新赋值,但实际上并没有改变d2的值
         * <p>
         * Note: <b>Remove Assignments to Parameters: 去除对参数的赋值,也是针对这种重新对对象赋值的情况而言</b>
         *
         * @param arg object
         */
        private static void nextDateReplace(Date arg) {
            arg = new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
            System.out.println("arg in nextDateReplace: " + arg);
        }
    }
}
