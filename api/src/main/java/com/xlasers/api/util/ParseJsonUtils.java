package com.xlasers.api.util;

import cn.hutool.core.text.StrBuilder;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

/**
 * <p>
 * 根据yapi-json格式,生成实体类,加注释
 * </p>
 *
 * @package: com.xlasers.api.util
 * @author: Elijah.D
 * @time: CreateAt 2018/11/1 && 12:48
 * @description: 生成实体类
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
public class ParseJsonUtils {
	/**
	 * yapi-json格式生成java实体类
	 *
	 * @param jsonStr json字符串
	 * @return response 实体类字段字符串
	 */
	public static String buildFieldsFromJson(String jsonStr) {
		JSONObject sourceJson = JSONUtil.parseObj(jsonStr);
		JSONObject outerJson = JSONUtil.parseObj(sourceJson.get("properties"));

		StrBuilder fields = new StrBuilder();
		outerJson.forEach((s, o) -> {
			JSONObject innerJson = JSONUtil.parseObj(o);
			fields.append("/**");
			fields.append(innerJson.get("description"));
			fields.append("*/");
			fields.append("private").append(" ");

			String type = String.valueOf(innerJson.get("type"));
			switch (type) {
				case "string":
					fields.append("String");
					break;
				case "number":
					fields.append("Number");
					break;
				case "array":
					fields.append("List<String>");
					break;
				default:
					fields.append(type);
					break;
			}
			fields.append(" ").append(s).append(";");
		});
		return fields.toString();
	}
}
