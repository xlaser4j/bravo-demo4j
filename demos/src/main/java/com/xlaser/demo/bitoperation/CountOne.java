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

	public static void main(String[] args) {
		countOne(8, ">>");
		countOne(8, ">>>");

		// 逻辑位移右侧补0,最后就是32个0
		countOne(-8, ">>>");

		// 注意这里算术位移会发生死循环,每次右侧补1,移到最后是32个1,一直保持32位
		//countOne(-8, ">>");
	}

	/**
	 * 统计一个整数的二进制表示中1的个数
	 *
	 * @param num  整数
	 * @param type 逻辑位移 or 算术位移
	 * @return count 个数
	 */
	private static void countOne(int num, String type) {
		log.info("【位移统计】类型: \"{}\", num: {},对应的二进制表示为: {}", type, num, Integer.toBinaryString(num));

		int count = 0;
		if (StrUtil.equals(type, MATH_MOVE)) {
			while (num != 0) {
				count += (num & 1);
				num >>= 1;
				log.info("【二进制】:{}, 长度{}", Integer.toBinaryString(num), Integer.toBinaryString(num).length());
			}
		}

		if (StrUtil.equals(type, LOGIC_MOVE)) {
			while (num != 0) {
				count += (num & 1);
				num >>>= 1;
				log.info("【二进制】:{}, 长度{}", Integer.toBinaryString(num), Integer.toBinaryString(num).length());
			}
		}

		log.info("【统计结果】位移类型: \"{}\",数字1出现的次数: {}个 !\n", type, count);
	}

	/**
	 * 1.上述移位的情况下,最大可循环32次
	 * 2.优化查询,利用每次与比自己小1的数与那么该数的二进制表示最后一个为1位上的1将将会被抹去
	 *
	 * @param num 测试数据
	 * @return 个数
	 */
	public int countOne(int num) {
		int res = 0;
		while (num != 0) {
			num &= (num - 1);
			res++;
		}
		return res;
	}
}
