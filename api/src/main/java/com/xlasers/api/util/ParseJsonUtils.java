package com.xlasers.api.util;

import cn.hutool.core.text.StrBuilder;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.xlasers.api.util
 * @author: Elijah.D
 * @time: CreateAt 2018/11/1 && 12:48
 * @description:
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
public class ParseJsonUtils {
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

    public static void main(String[] args) {
        String s = "{\n" +
                "  \"type\": \"object\",\n" +
                "  \"properties\": {\n" +
                "    \"viewName\": {\n" +
                "      \"type\": \"string\",\n" +
                "      \"description\": \"视图名字\"\n" +
                "    },\n" +
                "    \"viewChineseName\": {\n" +
                "      \"type\": \"string\",\n" +
                "      \"description\": \"视图中文名字\"\n" +
                "    },\n" +
                "    \"viewComment\": {\n" +
                "      \"type\": \"string\",\n" +
                "      \"description\": \"视图注释\"\n" +
                "    },\n" +
                "    \"colNum\": {\n" +
                "      \"type\": \"number\",\n" +
                "      \"description\": \"列数量\"\n" +
                "    },\n" +
                "    \"sql\": {\n" +
                "      \"type\": \"string\",\n" +
                "      \"description\": \"创建视图的语句,生成方式\"\n" +
                "    },\n" +
                "    \"inputTableNames\": {\n" +
                "      \"type\": \"array\",\n" +
                "      \"items\": {\n" +
                "        \"type\": \"string\"\n" +
                "      },\n" +
                "      \"description\": \"来源表 - 关系\"\n" +
                "    },\n" +
                "    \"contextPath\": {\n" +
                "      \"type\": \"string\",\n" +
                "      \"description\": \"上下文路径\"\n" +
                "    },\n" +
                "    \"createAt\": {\n" +
                "      \"type\": \"number\",\n" +
                "      \"description\": \"生效时间\"\n" +
                "    },\n" +
                "    \"createBy\": {\n" +
                "      \"type\": \"string\",\n" +
                "      \"description\": \"创建人\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
        System.out.println(buildFieldsFromJson(s));
    }
}
