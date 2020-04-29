package com.xlaser4j.refactor.chapter8.case9;

/**
 * @package: com.xlaser4j.refactor.chapter8.case9
 * @author: Elijah.D
 * @time: 4/29/2020 10:44 AM
 * @description: 以字面常量取代魔法数字
 * @modified: Elijah.D
 */
public class ReplaceMagicNumberWithSymbolicConstant {
    static final double GRAVITATIONAL_CONSTANT = 9.81;

    public static void main(String[] args) {
        System.out.println("魔法数字是有明确的意义,但是又不能明确表现出这种意义的数字;弊端在于可维护性以及可读性," +
                "如果在不同的地点引用,一旦数字发生变化,就需要全部修改,即使只有少数引用,但是也很难明确理解每个魔法数字的用途;" +
                "所以可以使用常量代替,常量不会造成任何心梗开销,同时可以大大提高代码的可读性.");
    }

    public static double potentialEnergy(double mass, double height) {
        return mass * GRAVITATIONAL_CONSTANT * height;
    }
}
