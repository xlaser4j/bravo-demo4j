package com.xlaser4j.refactor.chapter7.case8;

import java.util.Date;

/**
 * @package: com.xlaser4j.refactor.chapter7.case8
 * @author: Elijah.D
 * @time: 2020/3/23 15:33
 * @description: subclass实现
 * @modified: Elijah.D
 */
public class CustomeDateSubclass extends Date {
    private static final long serialVersionUID = 8097892968403877663L;

    /**
     * <b>构造函数委托源类构造</b>
     *
     * @param s
     */
    public CustomeDateSubclass(String s) {
        super(s);
    }

    /**
     * <b>添加转型构造函数,参数是源类对象</b>
     *
     * @param arg
     */
    public CustomeDateSubclass(Date arg) {
        super(arg.getTime());
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
