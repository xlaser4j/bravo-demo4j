package com.xlasers.api.util;

import cn.hutool.core.text.StrBuilder;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

/**
 * <p>
 * 根据yapi中的json格式,生成java对象
 * </p>
 *
 * @package: com.xlasers.api.util
 * @author: Elijah.D
 * @time: CreateAt 2018/11/1 && 12:48
 * @description: 生成java对象
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
public class ParseJsonUtils {
    private ParseJsonUtils() {
    }

    /**
     * 根据yapi生成java实体对象
     *
     * <p>数字类,统一转换为{@link Number}
     *
     * <p>集合类,统一转换为{@link java.util.List<String>}
     *
     * <p>深度一层,暂时不考虑对象嵌套对象的情况(可以内部生成一次,外部生成一次,手动组织对象)
     *
     * @param jsonStr yapi中的json
     * @return java字符串  实体类字符串
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
