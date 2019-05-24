package com.xlaser.demo.bitoperation;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 找出不大于N的最大的2的幂指数
 * </p>
 *
 * @package: com.xlaser.demo.bitoperation
 * @author: Elijah.D
 * @time: CreateAt 2019/5/24 && 15:01
 * @description: 对比位运算时间复杂度由O(logn)变成O(1)
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class FindMax {
	public static void main(String[] args) {
		findMax(Type.NORMAL, 9);
		findMax(Type.BIT, 9);

		findMax(Type.NORMAL, 65);
		findMax(Type.BIT, 65);

		// 二进制数为8位的时候只需要移到4,为16位时移到8,32位需要移到16
		findMax(Type.NORMAL, (int) Math.pow(2, 17));
		findMax(Type.BIT, (int) Math.pow(2, 17));
	}

	/**
	 * 查找一个整数的最大2次幂
	 * <p>
	 * eg:例如 N = 19，那么转换成二进制就是 00010011（这里为了方便，我采用8位的二进制来表示）。那么我们要找的数就是，把二进制中最左边的 1 保留，后面的 1 全部变为 0。即我们的目标数是 00010000
	 * <p>
	 * 通过把 n 右移并且做或运算即可得到。我解释下吧，我们假设最左边的 1 处于二进制位中的第 k 位(从左往右数),那么把 n 右移一位之后，那么得到的结果中第 k+1 位也必定为 1,然后把 n 与右移后的结果做或运算，那么得到的结果中第 k 和 第 k + 1 位必定是 1;同样的道理，再次把 n 右移两位，那么得到的结果中第 k+2和第 k+3 位必定是 1,然后再次做或运算，那么就能得到第 k, k+1, k+2, k+3 都是 1，如此往复下去....
	 *
	 * @param type 是否位运算
	 * @param num  给定的数字
	 */
	private static void findMax(Type type, int num) {
		int max = 1;
		switch (type) {
			case NORMAL:
				while (max * 2 <= num) {
					max *= 2;
				}
				log.info("【循环计算】{}的最大2次幂是:{},时间复杂度为:O(logn)", num, max);
				break;
			case BIT:
				int flag = num;
				// 假设num对应的二进制为32位: 0100_0001"移位+或"之后依次为: 0110_0000, 0111_1000, 0111_1111
				num |= num >>> 1;
				num |= num >>> 2;
				num |= num >>> 4;
				num |= num >>> 8;
				num |= num >>> 16;

				// 加1进位,后面全部0,再移位即可得到num对应二进制的最左边的1
				max = (num + 1) >>> 1;

				log.info("【位计算】{}的最大2次幂是:{},时间复杂度为:O(1)\n", flag, max);
				break;
			default:
				log.error("输入类型错误!");
				break;
		}
	}
}
