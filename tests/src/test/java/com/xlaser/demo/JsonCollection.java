package com.xlaser.demo;

import java.util.List;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.xlaser.demo.model.Arrow;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.xlaser.demo
 * @author: Elijah.D
 * @time: CreateAt 2019/1/10 && 17:35
 * @description:
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class JsonCollection {
	/**
	 * Test case 1.
	 *
	 * <P>hutool的Json对象toList/toBean方法
	 *
	 * <p>{@code 默认无参构造器}使用toBean,toList时,对应的javaBean必须包含无参构造器 !!!!</p>
	 */
	@Test
	void testCase1() {
		JSONArray arrowArr = JSONUtil.parseArray(
				"[" +
						"{\"source\": \"table-oracle@192.168.226.27@1521@orcl@DW_HOS@T_SFXMXJ_DM\",\"sourceDeleted\": false,\"target\": \"table-oracle@192.168.226.27@1521@orcl@XTGL@GY_YLSF\",\"targetDeleted\": false,\"value\": \"etl\"}," +
						"{\"source\": \"table-oracle@192.168.226.27@1521@orcl@DW_HOS@T_SFXMXJ_DM\",\"sourceDeleted\": false,\"target\": \"table-oracle@192.168.226.27@1521@orcl@MZXT@MZ_YJK2\",\"targetDeleted\": false,\"value\": \"etl\"}" +
						"]");
		log.info("【arrowArr】:{}", arrowArr);

		List<Arrow> arrows = JSONUtil.toList(arrowArr, Arrow.class);
		log.info("【arrows】:{}", arrows);

		// simple data
		Arrow arrowA = new Arrow("a", false, "b", false, ">>");
		Arrow arrowB = new Arrow("b", false, "c", false, ">>");
		List<Arrow> arrowList = Lists.newArrayList(arrowA, arrowB);

		// toBean
		Arrow jsonToBean = JSONUtil.toBean(JSONUtil.parseObj(arrowA), Arrow.class);
		log.info("【jsonToBean】:{}", jsonToBean);

		// toList
		List<Arrow> jsonsArrow = JSONUtil.toList(JSONUtil.parseArray(arrowList), Arrow.class);
		log.info("【jsonsArrow】:{}", jsonsArrow);
	}

	/**
	 * Test case2.
	 *
	 * <p> 测试fastJson中的toList
	 *
	 * <p> {@code 对应的java bean中必须包含无参构造}</p>
	 */
	@Test
	void testCase2() {
		String arrowArr =
				"[" +
						"{\"source\": \"table-oracle@192.168.226.27@1521@orcl@DW_HOS@T_SFXMXJ_DM\",\"sourceDeleted\": false,\"target\": \"table-oracle@192.168.226.27@1521@orcl@XTGL@GY_YLSF\",\"targetDeleted\": false,\"value\": \"etl\"}," +
						"{\"source\": \"table-oracle@192.168.226.27@1521@orcl@DW_HOS@T_SFXMXJ_DM\",\"sourceDeleted\": false,\"target\": \"table-oracle@192.168.226.27@1521@orcl@MZXT@MZ_YJK2\",\"targetDeleted\": false,\"value\": \"etl\"}" +
						"]";
		List<Arrow> arrowList = JSONObject.parseArray(arrowArr, Arrow.class);
		log.info("【arrowList】:{}", arrowList);
	}
}
