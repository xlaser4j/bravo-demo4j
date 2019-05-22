package com.xlaser.demo.bitoperation;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 统计一个整数的二进制数表示中1的个数
 * </p>
 *
 * @package: com.xlaser.demo.bitoperation
 * @author: Elijah.D
 * @time: CreateAt 2019/5/22 && 16:24
 * @description: 一个整数的二进制表示中有几个1
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class CountOne {
	/**
	 * 算术位移,考虑符号问题,右移(左移补0)时需要根据算术符号,正补0,负补1
	 */
	private static final String MATH_MOVE = ">>";

	/**
	 * 逻辑位移,右移,左移都补0,与算术符号无关
	 */
	private static final String LOGIC_MOVE = ">>>";

	/**
	 * 统计一个整数的二进制表示中1的个数
	 *
	 * @param num  整数
	 * @param type 逻辑位移 or 算术位移
	 * @return count 个数
	 */
	public static int conutOne(int num, String type) {
		log.info("【位移统计】num: {},对应的二进制表示为: {}", num, Integer.toBinaryString(num));

		int count = 0;
		if (StrUtil.equals(type, MATH_MOVE)) {
			while (num != 0) {
				count += (num & 1);
				num >>= 1;
			}
		}

		if (StrUtil.equals(type, LOGIC_MOVE)) {
			while (num != 0) {
				count += (num & 1);
				num >>>= 1;
			}
		}

		log.info("【{}】测试数据-num: {},二进制表示: {},位移计算统计数量: {}个 !", type, num, Integer.toBinaryString(num), count);

		return count;
	}
}
