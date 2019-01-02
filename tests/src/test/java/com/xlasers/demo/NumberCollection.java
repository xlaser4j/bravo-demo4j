package com.xlasers.demo;

import java.math.BigDecimal;
import java.text.DecimalFormat;

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
     * Test case 2.
     *
     * <p>测试BigDecimal转换百分比
     */
    @Test
    void testCase2() {
        BigDecimal ratio = BigDecimal.valueOf(0.501);

        DecimalFormat format1 = new DecimalFormat("#%");
        String s1 = format1.format(ratio);
        log.info("【s1】:{}", s1);

        DecimalFormat format2 = new DecimalFormat("#.00%");
        String s2 = format2.format(ratio);
        log.info("【s2】:{}", s2);
    }
}
