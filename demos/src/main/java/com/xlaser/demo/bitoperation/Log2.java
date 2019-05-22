package com.xlaser.demo.bitoperation;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 判断一个数是否是2的整数次幂
 * </p>
 *
 * @package: com.xlaser.demo.bitoperation
 * @author: Elijah.D
 * @time: CreateAt 2019/5/22 && 14:18
 * @description: 对比位运算的技巧
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class Log2 {
	/**
	 * 判断num是否是2的整数幂
	 *
	 * @param type 是否位运算
	 * @param num  验证的数据
	 * @return <code>true</code>是,<code>false</code>不是
	 */
	public static void log2(Type type, int num) {
		boolean flag;
		switch (type) {
			case NORMAL:
				int remainder = num;
				while (remainder >= 2) {
					remainder = remainder % 2;
				}
				flag = remainder == 0;
				log.info("normal计算-{}是2的整次幂: {}", num, flag);
				break;
			case BIT:
				flag = (num & (num - 1)) == 0;
				log.info("bit计算-{}是2的整次幂: {}", num, flag);
				break;
			default:
				log.error("输入类型错误!");
				break;
		}
	}
}
