package com.xlasers.hutool.excel;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * model: 视图信息
 * </p>
 *
 * @package: com.xlasers.hutool.excel
 * @author: Elijah.D
 * @time: CreateAt 2018/11/16 && 14:47
 * @description: 模型, 视图
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ViewInfo extends BaseNeoDTO {
    private static final long serialVersionUID = -8385743850681504124L;

    /**
     * schema名字
     */
    private String schemaName;

    /**
     * 视图名字
     */
    private String viewName;

    /**
     * 视图中文名字
     */
    private String viewChineseName;

    /**
     * 视图注释
     */
    private String viewComment;

    /**
     * 列数量
     */
    private Integer colNum;

    /**
     * 创建视图的语句,生成方式
     */
    private String sql;

    /**
     * 视图业务类型 - 关系
     */
    private String businessType;

    /**
     * 视图行业类型 - 关系
     */
    private String industryType;

    /**
     * 视图其他属性
     */
    private String otherType;
}
