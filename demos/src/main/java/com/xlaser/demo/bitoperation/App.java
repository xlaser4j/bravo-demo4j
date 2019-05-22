package com.xlaser.demo.bitoperation;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 位运算demo
 * </p>
 *
 * @package: com.xlaser.demo.bitoperation
 * @author: Elijah.D
 * @time: CreateAt 2019/5/21 && 10:07
 * @description: 位运算的小测试
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class App {
	public static void main(String[] args) {
		log.info("【swap-variable】......");
		SwapVariable.swap(Type.NORMAL);
		SwapVariable.swap(Type.BIT);
		SwapVariable.swap(Type.OTHER);

		log.error("\n");
		log.info("【is-odd】......");
		Odd.isOdd(Type.NORMAL, 20);
		Odd.isOdd(Type.NORMAL, 7);
		Odd.isOdd(Type.BIT, 20);
		Odd.isOdd(Type.BIT, 7);

		log.error("\n");
		log.info("【is-log2】......");
		Log2.log2(Type.NORMAL, 9);
		Log2.log2(Type.NORMAL, 32);
		Log2.log2(Type.BIT, 9);
		Log2.log2(Type.BIT, 32);

		log.error("\n");
		log.info("【count-one】......");
		CountOne.conutOne(8, ">>");
		CountOne.conutOne(8, ">>>");
		CountOne.conutOne(-8, ">>>");
		// 这里算术位移会发生死循环
		CountOne.conutOne(-8, ">>");
	}
}
