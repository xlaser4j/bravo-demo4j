package com.xlaser4j.refactor.chapter7.case7;

import java.util.Date;

/**
 * @package: com.xlaser4j.refactor.chapter7.case7
 * @author: Elijah.D
 * @time: 2020/3/23 15:20
 * @description:
 * @modified: Elijah.D
 */
public class IntroduceForeignMethod {
    private Date previousEnd;

    public static void main(String[] args) {
        System.out.println("当亦需要为提供服务的类增加一个函数,但是无法修改这个类时,可以在客户类总增加这个函数," +
                "并且以第一参数形式传入一个服务类实例;但是当大量外加函数时,需要使用Introduce Local Extension");
    }

    /**
     * Foreign method,should be on date: 因为日期类无法修改,这里需要一个特殊的方法,但是日期没有提供,可以通过
     * 引入函数,同时第一个参数是Date日期类来实现外加
     * <p>
     * Note: 利用<b>Introduce Foreign Method: 引入外加函数</b>重构
     *
     * @param arg date
     * @return next
     */
    private static Date nextDay(Date arg) {
        return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
    }

    void test() {
        // 假如我需要为date做扩展,获取下一天的方法
        Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);

        // refactor
        Date newStartR = nextDay(previousEnd);
        System.out.println(newStart + " " + newStartR);
    }
}
