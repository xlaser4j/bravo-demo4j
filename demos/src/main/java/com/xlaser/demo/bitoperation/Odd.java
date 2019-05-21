package com.xlaser.demo.bitoperation;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 判断是否为基数
 * </p>
 *
 * @package: com.xlaser.demo.bitoperation
 * @author: Elijah.D
 * @time: CreateAt 2019/5/21 && 14:51
 * @description: 对比位运算
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class Odd {
	/**
	 * 判断num是否奇数
	 *
	 * @param type 是否位运算
	 * @param num  验证的数据
	 * @return <code>true</code>是奇数,<code>false</code>不是奇数
	 */
	public static void isOdd(Type type, int num) {
		boolean flag;
		switch (type) {
			case NORMAL:
				flag = num % 2 == 1;
				log.info("normal计算-{}是奇数: {}", num, flag);
				break;
			case BIT:
				flag = (num & 1) == 1;
				log.info("bit计算-{}是奇数: {}", num, flag);
				break;
			default:
				flag = num % 2 != 0;
				log.info("normal-{}是奇数: {}", num, flag);
				break;
		}
	}
}
