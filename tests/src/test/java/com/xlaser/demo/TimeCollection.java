package com.xlaser.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * The type Time collection.
 *
 * @package: com.xlaser.demo
 * @author: Elijah.D
 * @time: CreateAt 2018/10/15 && 14:46
 * @description: 日期时间类demo
 * @copyright: Copyright © 2018 xlaser
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

	/**
	 * Test case 2.
	 *
	 * <P>hutool日期工具类
	 */
	@Test
	void testCase2() {

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

	/**
	 * Test case 3.
	 *
	 * <P>hutool时间工具类-计算间隔时间
	 */
	@Test
	void testCase3() throws InterruptedException {
		TimeInterval interval = new TimeInterval();

		Thread.sleep(3000);
		long time1 = interval.interval();
		log.info("【time1】:{}", time1);

		Thread.sleep(2000);
		long time2 = interval.interval();
		log.info("【time2】:{}", time2);

		interval.restart();
		Thread.sleep(1000);
		long time3 = interval.interval();
		log.info("【time3】:{}", time3);
	}
}
