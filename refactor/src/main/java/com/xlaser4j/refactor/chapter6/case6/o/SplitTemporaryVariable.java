package com.xlaser4j.refactor.chapter6.case6.o;

/**
 * @package: com.xlaser4j.refactor.chapter6.case6.o
 * @author: Elijah.D
 * @time: 2020/3/20 14:17
 * @description:
 * @modified: Elijah.D
 */
public class SplitTemporaryVariable {
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
     * temp被赋值两次
     */
    void test() {
        double temp = 2 * (height + width);
        System.out.println(temp);
        temp = height * width;
        System.out.println(temp);
    }

    /**
     * acc被赋值两次
     *
     * @param time 运动时长
     * @return 距离
     */
    double getDistanceTravelled(int time) {
        double result;
        double acc = primaryForce / mass;
        int primaryTime = Math.min(time, delay);
        result = 0.5 * acc * primaryTime * primaryTime;

        // 运动时长太短,未到第二次作用力的时间
        int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            // 第一次的初始速度0,第二次作用力的初始速度
            double primaryVel = acc * delay;
            acc = (primaryForce + secondaryForce) / mass;
            result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
        }
        return result;
    }
}
