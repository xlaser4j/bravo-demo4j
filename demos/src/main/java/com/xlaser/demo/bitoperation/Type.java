package com.xlaser.demo.bitoperation;

/**
 * <p>
 * 定义两种类型: 1-位运算 2-正常计算
 * </p>
 *
 * @package: com.xlaser.demo.bitoperation
 * @author: Elijah.D
 * @time: CreateAt 2019/5/21 && 10:25
 * @description: 定义区分位运算
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
public enum Type {
	/**
	 * 位运算
	 */
	BIT,

	/**
	 * 正常计算,根据不同数据类型做计算,如int可以求和,数组可以添加,字符串可以拼接等
	 */
	NORMAL,

	/**
	 * temp,借助第三个变量
	 */
	OTHER
}
