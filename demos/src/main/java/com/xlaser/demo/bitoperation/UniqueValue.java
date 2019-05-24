package com.xlaser.demo.bitoperation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 在其他数都出现两次的数组中找到只出现一次的那个数
 * </p>
 *
 * @package: com.xlaser.demo.bitoperation
 * @author: Elijah.D
 * @time: CreateAt 2019/5/24 && 10:50
 * @description: 在其他数都出现两次的数组中找到只出现一次的那个数
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class UniqueValue {
	public static void main(String[] args) {
		// 整数
		List<Integer> nums = Lists.newArrayList(1, 1, 12, 12, 8, 10, 10, 9, 9);
		getUniqueValue(nums, Type.NORMAL);
		getUniqueValue(nums, Type.BIT);

		// 字符串-转hashcode之后计算得出数字之后,还需要再次遍历对比真正的字符串,比较麻烦
		List<String> strs = Lists.newArrayList("A", "A", "B", "B", "MQ", "N", "N", "P", "P");
		getUniqueValue(strs, Type.NORMAL);
		List<Integer> newNums = Lists.newArrayList();
		strs.forEach(str -> newNums.add(str.hashCode()));
		getUniqueValue(newNums, Type.BIT);
	}

	/**
	 * 两种方法获取唯一数
	 *
	 * @param nums 数组
	 * @param type 位用算 || 正常计算
	 */
	@SuppressWarnings("unchecked")
	private static void getUniqueValue(List nums, Type type) {
		log.info("【统计唯一出现】数组: {}", nums.toString());
		switch (type) {
			case NORMAL:
				Map maps = new HashMap<>(1);
				nums.forEach(num -> {
					if (maps.containsKey(num)) {
						maps.remove(num, num);
					} else {
						maps.put(num, num);
					}
				});
				log.info("【multimap】利用multimap统计计算,出现一次的字符为: {}\n", Lists.newArrayList(maps.values()).get(0));
				break;
			case BIT:
				int init = 0;
				for (Object num : nums) {
					init = (int) num ^ init;
				}
				log.info("【bit-operation】利用位的\"^\":异或统计计算,出现一次的字符为: {}\n", init);
				break;
			default:
				break;
		}
	}
}
