package com.xlaser.demo.bitoperation;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 记录一次hash碰撞
 * </p>
 *
 * @package: com.xlaser.demo.bitoperation
 * @author: Elijah.D
 * @time: CreateAt 2019/5/24 && 11:51
 * @description: 基于String的hashcode计算方法
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class HashConflict {
	public static void main(String[] args) {
		log.info("【字符串Aa】hashcode计算值: {}", "Aa".hashCode());
		log.info("【字符串BB】hashcode计算值: {}", "BB".hashCode());
	}
}
