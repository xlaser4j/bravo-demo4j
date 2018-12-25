package com.xlasers.excel.util;

import java.lang.reflect.Field;
import java.util.List;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ReflectUtil;
import cn.hutool.core.util.StrUtil;
import com.xlasers.excel.excel.DictInfo;

import static com.xlasers.excel.constant.CopyConsts.DICT_TYPES;
import static com.xlasers.excel.constant.CopyConsts.INDEX_TYPES;

/**
 * <p>
 * util: 属性复制器
 * </p>
 *
 * @package: com.xlasers.excel.util
 * @author: Elijah.D
 * @time: CreateAt 2018/11/19 && 10:41
 * @description: 工具类, 针对字典类特殊复制处理
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
public class BeanUtils {
    private BeanUtils() {
    }

    /**
     * <p>针对neo对象的list类型的封装复制工具类
     *
     * <p>1.类型list,字段为索引信息的字段eg:{@link com.xlasers.excel.excel.ColumnInfo#indexDetail}的字段
     *
     * <p>2.类型list,字段为字典类型eg:{@link com.xlasers.excel.excel.TableInfo#businessType}的字段
     *
     * @param source 源DTO
     * @param target 目DO
     */
    public static void copy(Object source, Object target) {

        // 忽略list复制
        BeanUtil.copyProperties(source, target, CopyOptions.create().setIgnoreProperties("serialVersionUID").setIgnoreError(true));

        Field[] fields = ReflectUtil.getFields(source.getClass());
        CollUtil.newArrayList(fields).forEach(o -> {
            Object filedValue = ReflectUtil.getFieldValue(source, o);
            List<String> filedListValues;

            // 处理字典
            if (DICT_TYPES.contains(o.getName()) && filedValue != null) {
                filedListValues = StrUtil.splitTrim(filedValue.toString(), ",");
                List<DictInfo> dictInfos = CollUtil.newArrayList();
                filedListValues.forEach(o2 -> dictInfos.add(new DictInfo(o2, o.getName())));
                ReflectUtil.setFieldValue(target, o.getName(), dictInfos);
            }

            // 处理索引
            if (INDEX_TYPES.contains(o.getName()) && filedValue != null) {
                filedListValues = StrUtil.splitTrim(filedValue.toString(), ",");
                ReflectUtil.setFieldValue(target, o.getName(), filedListValues);
            }
        });
    }
}
