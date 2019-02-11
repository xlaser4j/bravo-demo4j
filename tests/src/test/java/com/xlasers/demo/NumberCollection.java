package com.xlasers.demo;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import cn.hutool.core.util.NumberUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * The type Number collection.
 *
 * @package: com.xlasers.demo
 * @author: Elijah.D
 * @time: CreateAt 2018/10/19 && 13:07
 * @description: 数字类demo
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class NumberCollection {
    /**
     * Test case 1.
     *
     * <p>测试long转换int
     */
    @Test
    void testCase1() {

        log.info("【Max】int最大值: {}", Integer.MAX_VALUE);
        long value = 2147483648L;

        log.info("【溢出转换】溢出后的值 intValue: {}", (int) value);

        assertThrows(ArithmeticException.class, () -> Math.toIntExact(value));
    }

    /**
     * Test case 2. todo
     *
     * <p>测试BigDecimal转换百分比
     */
    @Test
    void testCase2() {
        BigDecimal ratio1 = BigDecimal.valueOf(0.5051);
        DecimalFormat format1 = new DecimalFormat("#%");
        String s1 = format1.format(ratio1);
        log.info("【s1】:{}", s1);

        DecimalFormat format2 = new DecimalFormat("#.00%");
        String s2 = format2.format(ratio1);
        log.info("【s2】:{}", s2);

        BigDecimal ratio2 = BigDecimal.valueOf(0.9355);
        DecimalFormat format3 = new DecimalFormat("#%");
        String s3 = format3.format(ratio2);
        log.info("【s3】:{}", s3);

        DecimalFormat format4 = new DecimalFormat("#.00%");
        String s4 = format4.format(ratio2);
        log.info("【s4】:{}", s4);

        BigDecimal ratio = NumberUtil.roundDown(ratio2, 2);
        log.info("【ratio】:{}", ratio);
        DecimalFormat format = new DecimalFormat("#%");
        String s = format.format(ratio);
        log.info("【s】:{}", s);
    }

    /**
     * Test case 3.
     * <p>
     * 在-128 至 127 范围内的赋值，Integer对象是在IntegerCache.cache产生，会复用已有对象，
     * 这个区间内的Integer值可以直接使用==进行判断，但是这个区间之外的所有数据，都会在堆上产生，
     * 并不会复用已有对象，这是一个大坑，推荐使用equals方法进行判断。
     *
     * <p>测试lInteger
     */
    @Test
    void testCase3() {
        Integer number1 = -128;
        Integer number2 = -128;
        log.info("【-128-127】:{}", number1 == number2);
        Integer number3 = 127;
        Integer number4 = 127;
        log.info("【-128-127】:{}", number3 == number4);
        Integer number5 = -129;
        Integer number6 = -129;
        log.info("【-128-127】:{}", number5 == number6);
        log.info("【-128-127】:{}", number5.equals(number6));
        Integer number7 = 128;
        Integer number8 = 128;
        log.info("【-128-127】:{}", number7 == number8);
        log.info("【-128-127】:{}", number7.equals(number8));
    }
}
