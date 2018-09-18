package com.xlasers.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * The type Test collection one.
 *
 * @package: com.xlasers.demo
 * @author: Elijah.D
 * @time: CreateAt 2018/9/18 && 10:14
 * @description:
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
class TestCollectionOne {
    /**
     * Test case 1.
     *
     * <P>hutool日期工具类
     */
    @Test
    void testCase1() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = "2018-07-18 11:11:11";

        Long timeOne = DateUtil.parse(time).getTime();

        Long timeTwo = null;
        try {
            timeTwo = sdf.parse(time).getTime();
        } catch (ParseException e) {
            log.info("【hutool】日期工具类测试 !");
        }

        assertEquals(timeOne, timeTwo);

        Date date = DateUtil.date(timeOne);
        assertNotEquals(Date.class, date.getClass());
    }
}
