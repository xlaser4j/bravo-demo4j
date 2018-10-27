package com.xlasers.api.api;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import cn.hutool.core.util.ReflectUtil;
import com.xlasers.api.util.ParseDocUtils;
import lombok.extern.slf4j.Slf4j;

import static com.xlasers.api.constant.ApiConsts.*;

/**
 * @package: com.xlasers.api.api
 * @author: Elijah.D
 * @time: CreateAt 2018/10/26 && 9:10
 * @description:
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class BuildApi {
	public static String toApi(Class clazz, Integer responseType) {
		Map fieldsMap = ParseDocUtils.getFiledComments(clazz);

		StringBuilder api = new StringBuilder();
		if (responseType.equals(ResponseType.OBJECT.getValue())) {
			api.append(RESPONSE_OBJECT_START);
		}

		if (responseType.equals(ResponseType.ARRAY.getValue())) {
			api.append(RESPONSE_ARRAY_START);
		}

		StringBuilder temp = api;
		Field[] fields = ReflectUtil.getFields(clazz);
		Arrays.stream(fields).forEach(o -> {
			temp.append("\"").append(o.getName()).append("\"").append(":");
			temp.append("{");
			temp.append(TYPE);
			if (Number.class.isAssignableFrom(o.getType())) {
				temp.append(NUMBER);
			}
			if (o.getType().equals(String.class)) {
				temp.append(STRING);
			}
			if (o.getType().equals(List.class)) {
				temp.append(ARRAY);
			}
			temp.append(DESCRIPTION);
			temp.append("\"").append(fieldsMap.get(o.getName())).append("\"");
			temp.append("},");
		});

		api = temp.deleteCharAt(temp.length() - 1);

		if (responseType.equals(ResponseType.OBJECT.getValue())) {
			api.append(RESPONSE_OBJECT_END);
		}

		if (responseType.equals(ResponseType.ARRAY.getValue())) {
			api.append(RESPONSE_ARRAY_END);
		}

		return api.toString();
	}
}
