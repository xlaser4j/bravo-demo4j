package com.xlasers.api.api;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

import cn.hutool.core.util.ReflectUtil;
import com.xlasers.api.Api;
import com.xlasers.api.targets.EsDbInfo;
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
    public static void main(String[] args) {

        log.info("【Api】");

        System.out.println(toApi(EsDbInfo.class));
    }

    private static String toApi(Class clazz) {
        Map fieldsMap = ParseDocUtils.getFiledComments(clazz);

        StringBuilder api = new StringBuilder();
        api.append("{");

        Field[] fields = ReflectUtil.getFields(clazz);
        Arrays.stream(fields).forEach(o -> {
            api.append("\"").append(o.getName()).append("\"").append(":");
            api.append("{");
            api.append(TYPE);
            if (o.getType().equals(Integer.class)) {
                api.append(NUMBER);
            }
            if (o.getType().equals(String.class)) {
                api.append(STRING);
            }
            api.append(DESCRIPTION);
            api.append("\"").append(fieldsMap.get(o.getName())).append("\"");
            api.append("},");
        });

        return api.substring(0, api.length() - 1) + "}";
    }
}
