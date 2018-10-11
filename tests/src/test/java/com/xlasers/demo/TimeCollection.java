package com.xlasers.demo;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * The type Time collection.
 *
 * @package: com.xlasers.demo
 * @author: Elijah.D
 * @time: CreateAt 2018/10/15 && 14:46
 * @description: 日期时间类demo
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class TimeCollection {
    /**
     * Test case 1.
     *
     * <p>测试localDate</p>
     */
    @Test
    void testCase1() {

        LocalDateTime time = LocalDateTime.now();
        log.info("【localDateTime】测试time: {}", time);

        // 获取 -"当前"- 秒的值
        int second = time.getSecond();
        log.info("【localDateTime】测试,当前时间的秒数位置second: {}", second);

        //获取 -"当前"- 纳秒的值
        int nano = time.getNano();
        log.info("【localDateTime】测试,当前时间的纳秒数位置nano: {}", nano);

        // 获取 -"累计"- 秒的值
        long seconds = time.toInstant(ZoneOffset.ofHours(8)).getEpochSecond();
        log.info("【localDateTime】测试,当前时间累计的秒数值seconds: {}", seconds);
        log.info("【localDateTime】测试,seconds: {}", System.currentTimeMillis() / 1000);

        // 获取 -"累计"- 毫秒的值
        long mill = time.toInstant(ZoneOffset.ofHours(8)).toEpochMilli();
        log.info("【localDateTime】测试mill: {}, 格式化:{}", mill, DateUtil.formatDateTime(DateUtil.date(mill)));
        log.info("【localDateTime】测试mill: {}, 格式化:{}", System.currentTimeMillis(), DateUtil.formatDateTime(DateUtil.date(System.currentTimeMillis())));
    }
}
