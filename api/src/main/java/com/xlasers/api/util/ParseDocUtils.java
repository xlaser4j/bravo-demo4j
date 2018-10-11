package com.xlasers.api.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import com.github.therapi.runtimejavadoc.ClassJavadoc;
import com.github.therapi.runtimejavadoc.Comment;
import com.github.therapi.runtimejavadoc.RuntimeJavadoc;
import com.google.common.collect.Maps;
import com.xlasers.api.targets.EsDbInfo;

/**
 * <p>
 * 解析javadoc,获取相关注释
 * </p>
 *
 * @package: com.xlasers.api.util
 * @author: Elijah.D
 * @time: CreateAt 2018/10/26 && 13:46
 * @description: 解析doc工具类
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
public class ParseDocUtils {
	public static String getFiledComment(String className, String filedName) {
		ClassJavadoc docs = RuntimeJavadoc.getJavadoc(className);
		AtomicReference<Comment> s = new AtomicReference<>();
		docs.getFields().forEach(o -> {
			if (filedName.startsWith(o.getName())) {
				s.set(o.getComment());
			}
		});

		return String.valueOf(s.get());
	}

	public static Map<String, String> getFiledComments(Class clazz) {
		ClassJavadoc docs = RuntimeJavadoc.getJavadoc(clazz);
		HashMap<String, String> fieldsMap = Maps.newHashMapWithExpectedSize(50);
		docs.getFields().forEach(o -> fieldsMap.put(o.getName(), o.getComment().toString()));

		Class superClass = clazz.getSuperclass();
		if (superClass != null) {
			docs = RuntimeJavadoc.getJavadoc(superClass);
			docs.getFields().forEach(o -> fieldsMap.put(o.getName(), o.getComment().toString()));
		}

		return fieldsMap;
	}

	public static void main(String[] args) {
		System.out.println(getFiledComments(EsDbInfo.class));
	}
}
