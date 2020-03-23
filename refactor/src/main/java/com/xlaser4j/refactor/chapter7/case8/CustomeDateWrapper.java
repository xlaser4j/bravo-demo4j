package com.xlaser4j.refactor.chapter7.case8;

import java.util.Date;

/**
 * @package: com.xlaser4j.refactor.chapter7.case8
 * @author: Elijah.D
 * @time: 2020/3/23 15:39
 * @description: wrapper实现
 * @modified: Elijah.D
 */
public class CustomeDateWrapper {
    /**
     * 声明源对象
     */
    private Date original;

    /**
     * <b>构造函数实际上委托给源类</b>
     *
     * @param s
     */
    public CustomeDateWrapper(String s) {
        original = new Date(s);
    }

    /**
     * <b>添加转型构造函数,参数是源类对象,同时赋值给源对象</b>
     *
     * @param arg
     */
    public CustomeDateWrapper(Date arg) {
        original = arg;
    }

    /**
     * 使用original重写所有源对象方法 ... eg: getYear()
     */
    public int getYear() {
        return original.getYear();
    }

    /**
     * <b>添加新特性扩展即可,将所有date类型的IntroduceForeignMethod外加函数移到这个类中</b>
     *
     * @return
     */
    Date nextDay() {
        return new Date();
    }
}
