package com.xlasers.api.yapi;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import cn.hutool.core.util.ReflectUtil;
import cn.hutool.core.util.StrUtil;
import com.xlasers.api.util.ParseDocUtils;

import static com.xlasers.api.constant.ApiConsts.*;

/**
 * <p>
 * 构建yapi统一入口类
 * </p>
 *
 * <p>构建yapi返回类型的json字符串{@link BuildApi#toResponseJson(Class, Integer)},可以生成返回
 * 单个对象{@link ResponseType#OBJECT}或者列表的{@link ResponseType#ARRAY}的json字符串
 *
 * <p>构建yapi参数的json字符串
 *
 * @package: com.xlasers.api.yapi
 * @author: Elijah.D
 * @time: CreateAt 2018/10/26 && 9:10
 * @description: 生成json字符串
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
public class BuildApi {
    private BuildApi() {
    }

    /**
     * <p>生成yapi需要的json字符串
     *
     * @param clazz        api放回的类对象
     * @param responseType 返回的类型{@link ResponseType},1-返回对象,2-返回列表
     * @return json        构建完成的json字符串
     */
    public static String toResponseJson(Class clazz, Integer responseType) {

        // 获取字段javadoc注释
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

            // 排除序列化字段
            if (StrUtil.equals(o.getName(), SERIAL_UID)) {
                return;
            }

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
