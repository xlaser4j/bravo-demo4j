package com.xlaser4j.refactor.chapter6.case1.r;

import java.util.ArrayList;
import java.util.List;

import com.xlaser4j.refactor.chapter6.case1.o.Order;

/**
 * @package: com.xlaser4j.refactor.chapter6.case1.o
 * @author: Elijah.D
 * @time: 2020/3/19 16:17
 * @description: Refactor-重构代码
 * @modified: Elijah.D
 */
public class ExtractMethodR {
    private String name;

    private List<Order> orders = new ArrayList<>();

    /**
     * 利用<b>Extract Method(提炼函数)</b>进行重构
     *
     * @param previousAmount 初始值
     */
    public void printOwing(double previousAmount) {
        printBanner();

        double outstanding = getOutstanding(previousAmount * 1.5);

        printDetails(outstanding);
    }

    /**
     * Note: <b>直接提取,无局部变量干扰</b>
     */
    private void printBanner() {
        System.out.println("************************");
        System.out.println("**** Customer Owes ****");
        System.out.println("************************");
    }

    /**
     * Note: <b>outstanding临时变量的处理,因为初始化有逻辑处理previous*1.5,所以需要传入参数
     * 如果仅仅是初始化为0.0,则可以不用参数,直接方法内部声明初始化即可</b>
     *
     * @param initialValue previousAmount
     * @return outstanding
     */
    private double getOutstanding(double initialValue) {
        double result = initialValue;
        for (Order order : orders) {
            result += order.getAmount();
        }
        return result;
    }

    /**
     * Note: <b>name局部变量的处理,可以直接读取</b>
     * <p>
     * Note: <b>outstanding临时变量的处理,因为details只是读取,没有修改所以直接当参数即可</b>
     *
     * @param outstanding amount
     */
    private void printDetails(double outstanding) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }
}
