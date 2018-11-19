package com.xlasers.hutool.util;

import java.lang.reflect.Field;
import java.util.List;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ReflectUtil;

/**
 * <p>
 * util: 属性复制器
 * </p>
 *
 * @package: com.xlasers.hutool.util
 * @author: Elijah.D
 * @time: CreateAt 2018/11/19 && 10:41
 * @description: 工具类, 针对字典类特殊复制处理
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
public class BeanUtils {
    public static void copy(Object source, Object target) {

        BeanUtil.copyProperties(source, target, CopyOptions.create().setIgnoreError(true));

        List<String> fieldNames = CollUtil.newArrayList();
        CollUtil.newArrayList( ReflectUtil.getFields(source.getClass())).forEach(o->fieldNames.add(o.getName()));
        if (fieldNames.contains("businessType")){

        }

    }
}
