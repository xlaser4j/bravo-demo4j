package com.xlasers.excel.constant;

import java.util.List;

import cn.hutool.core.collection.CollUtil;

/**
 * <p>
 * const: 属性复制常量
 * </p>
 *
 * @package: com.xlasers.excel.constant
 * @author: Elijah.D
 * @time: CreateAt 2018/11/19 && 13:40
 * @description: list类型常量
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
public final class CopyConsts {
    /**
     * 表业务类型 - 关系
     */
    public static final String BUSINESS_TYPE = "businessType";

    /**
     * 表行业类型 - 关系
     */
    public static final String INDUSTRY_TYPE = "industryType";

    /**
     * 其他属性
     */
    public static final String OTHER_TYPE = "otherType";

    /**
     * 模型类型表: 维表、事实表、中间表
     */
    public static final String MODEL_TYPE = "modelType";

    /**
     * 内容类型表: 业务流水表、代码表、业务操作表
     */
    public static final String CONTENT_TYPE = "contentType";

    /**
     * 物理类型表: 外部表、普通表、索引组织表
     */
    public static final String PHYSICAL_TYPE = "physicalType";

    /**
     * 字典类型常量
     */
    public static final List<String> DICT_TYPES = CollUtil.newArrayList(BUSINESS_TYPE, INDUSTRY_TYPE, OTHER_TYPE, MODEL_TYPE, CONTENT_TYPE, PHYSICAL_TYPE);

    /**
     * 索引信息
     */
    public static final String INDEX_DETAIL = "indexDetail";

    /**
     * 单列索引名称+列名
     */
    public static final String SINGLE_INDEX_DETAIl = "singleIndexDetail";

    /**
     * 组合索引名称+列名
     */
    public static final String COMBINATION_INDEX_DETAIl = "combinationIndexDetail";

    /**
     * 索引类型常量
     */
    public static final List<String> INDEX_TYPES = CollUtil.newArrayList(INDEX_DETAIL, SINGLE_INDEX_DETAIl, COMBINATION_INDEX_DETAIl);

    private CopyConsts() {
    }
}
