package com.xlasers.excel.excel;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * model: 视图
 * </p>
 *
 * @package: com.xlasers.excel.excel
 * @author: Elijah.D
 * @time: CreateAt 2018/11/19 && 9:48
 * @description: 模型, 视图
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ViewInfo extends BaseNeoDO {
    private static final long serialVersionUID = 6964443821326201363L;

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
     * 所属数据库 - 关系
     */
    //@Relationship(value = NeoConsts.R_VIEW_INFO, direction = Relationship.INCOMING)
    private DbInfo dbInfo;

    /**
     * 来源表 - 关系
     */
    //@Relationship(value = NeoConsts.R_VIEW_INPUT_TABLE, direction = Relationship.INCOMING)
    private List<TableInfo> inputTables;

    /**
     * 视图业务类型 - 关系
     */
    private List<DictInfo> businessType;

    /**
     * 视图行业类型 - 关系
     */
    private List<DictInfo> industryType;

    /**
     * 视图其他属性
     */
    private List<DictInfo> otherType;
}
