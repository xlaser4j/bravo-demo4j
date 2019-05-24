package com.xlaser.demo.bitoperation;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 求解3的n次方,对比位运算
 * eg:n = 13，则n的二进制表示为1101那么3的13次方可以拆解为:3^1101 = 3^0001 * 3^0100 * 3^1000
 * </p>
 *
 * @package: com.xlaser.demo.bitoperation
 * @author: Elijah.D
 * @time: CreateAt 2019/5/24 && 14:37
 * @description: 时间复杂度由O(n)变成O(logn)
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class Pow {
	public static void main(String[] args) {
		pow(2, Type.NORMAL);
		pow(2, Type.BIT);

		pow(4, Type.NORMAL);
		pow(4, Type.BIT);
	}

	private static void pow(int n, Type type) {
		int sum = 1;
		int tem = 3;
		switch (type) {
			case NORMAL:
				for (int i = 0; i < n; i++) {
					sum *= tem;
				}
				log.info("【循环计算】3的{}次方:{},时间复杂度位O(n)", n, sum);
				break;
			case BIT:
				int flag = n;
				while (n != 0) {
					if ((n & 1) == 1) {
						sum *= tem;
					}
					// 每次移位3^(2^0), 3^(2^1), 3^(2^2)
					tem *= tem;
					n = n >>> 1;
				}
				log.info("【位计算】3的{}次方:{},时间复杂度位O(logn)\n", flag, sum);
				break;
			default:
				log.error("输入类型错误!");
				break;
		}
	}
}
