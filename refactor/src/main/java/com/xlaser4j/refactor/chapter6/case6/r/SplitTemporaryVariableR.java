package com.xlaser4j.refactor.chapter6.case6.r;

/**
 * @package: com.xlaser4j.refactor.chapter6.case6.o
 * @author: Elijah.D
 * @time: 2020/3/20 14:17
 * @description:
 * @modified: Elijah.D
 */
public class SplitTemporaryVariableR {
    double height;

    double width;

    /**
     * 初始力
     */
    double primaryForce;

    /**
     * 第二个作用力
     */
    double secondaryForce;

    /**
     * 质量
     * <p>
     * 加速度: F/M(力除以质量)
     * 距离: v * t + 1/2 * a * t^(初始速度*时间 + 0.5*加速度*时间的平方)
     */
    double mass;

    /**
     * 第个力的作用时间
     */
    int delay;

    /**
     * 利用<b>Split Temporary Variable: 分解临时变量</b>重构
     * <p>
     * 程序中的某个变量,如果不是因为循环,或者收集计算结果(自增减)等,请不要多次赋值,应该针对每一次赋值,
     * 创造一个对应的独立临时final变量
     */
    void test() {
        final double perimeter = 2 * (height + width);
        System.out.println(perimeter);

        final double area = height * width;
        System.out.println(area);
    }

    /**
     * 利用<b>Split Temporary Variable: 分解临时变量</b>重构
     *
     * @param time 运动时长
     * @return 距离
     */
    double getDistanceTravelled(int time) {
        double result;
        final double primaryAcc = primaryForce / mass;
        int primaryTime = Math.min(time, delay);
        result = 0.5 * primaryAcc * primaryTime * primaryTime;

        int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            double primaryVel = primaryAcc * delay;
            final double secondaryAcc = (primaryForce + secondaryForce) / mass;
            result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
        }
        return result;
    }

    /**
     * 利用<b>Split Temporary Variable => Extract Method: 分解临时变量,然后提取方法</b>重构
     *
     * @param time 运动时长
     * @return 距离
     */
    double getDistanceTravelled2(int time) {
        double result = 0.5 * primaryAcc() * primaryTime(time) * primaryTime(time);
        result += secondaryDistance(time - delay);

        return result;
    }

    private int primaryTime(int time) {
        return Math.min(time, delay);
    }

    private double primaryAcc() {
        return primaryForce / mass;
    }

    private double secondaryAcc() {
        return (primaryForce + secondaryForce) / mass;
    }

    private double secondaryDistance(int secondaryTime) {
        if (secondaryTime > 0) {
            double primaryVel = primaryAcc() * delay;
            return primaryVel * secondaryTime + 0.5 * secondaryAcc() * secondaryTime * secondaryTime;
        }
        return 0;
    }
}
