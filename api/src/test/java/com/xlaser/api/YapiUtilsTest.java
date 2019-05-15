package com.xlaser.api;

import cn.hutool.json.JSONUtil;
import com.xlaser.api.targets.EsDbInfo;
import com.xlaser.api.yapi.YapiUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <p>
 * 测试类,生成json
 * </p>
 *
 * @package: com.xlaser.api
 * @author: Elijah.D
 * @time: CreateAt 2018/10/28 && 11:36
 * @description: 生成json ==> yapi
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class YapiUtilsTest {
	/**
	 * Test build api.
	 */
	@Test
	public void testBuildApi() {

		String json = YapiUtils.toResponseJson(EsDbInfo.class, 1);
		log.info("======【生成json】====== \n {}", json);

		Assertions.assertTrue(JSONUtil.isJsonObj(json));
	}
}
