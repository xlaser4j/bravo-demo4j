package com.xlasers.demo;

import java.util.Arrays;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @package: com.xlasers.demo
 * @author: Elijah.D
 * @time: CreateAt 2018/10/23 && 22:54
 * @description:
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class CollectionCollection {
	/**
	 * Test case 1.
	 *
	 * <P>集合包含方法contains()
	 */
	@Test
	void testCase1() {

		List<Long> ids = Arrays.asList(1L, 2L);
		boolean flag = ids.contains(1L);
		// TODO
		log.info("【】{}", flag);
	}
}
