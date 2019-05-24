package com.xlaser.demo.bitoperation;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 变量值交换,不借助第三个变量
 * </p>
 *
 * @package: com.xlaser.demo.bitoperation
 * @author: Elijah.D
 * @time: CreateAt 2019/5/21 && 10:22
 * @description: 对比位运算
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class SwapVariable {
	public static void main(String[] args) {
		SwapVariable.swap(Type.NORMAL);
		SwapVariable.swap(Type.BIT);
		SwapVariable.swap(Type.OTHER);
	}

	/**
	 * 对比两种交换变量方法,注意@<code>normal</code>方法,要根据具体的变量类型取巧计算!
	 * 不一定完全适用!
	 *
	 * @param type 三种类型对比
	 */
	public static void swap(Type type) {
		int a = 3;
		int b = 5;
		switch (type) {
			case NORMAL:
				a = a + b;
				b = a - b;
				a = a - b;
				log.info("normal-交换后的值: a = {}, b = {}", a, b);
				break;
			case BIT:
				a = a ^ b;
				b = a ^ b;
				a = a ^ b;
				log.info("bit-交换后的值: a = {}, b = {}", a, b);
				break;
			default:
				int temp = a;
				a = b;
				b = temp;
				log.info("temp-交换后的值: a = {}, b = {}", a, b);
				break;
		}
	}
}
