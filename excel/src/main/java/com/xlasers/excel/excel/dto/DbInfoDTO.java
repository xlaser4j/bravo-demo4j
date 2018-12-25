package com.xlasers.excel.excel.dto;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * model: 字典
 * </p>
 *
 * @package: com.xlasers.excel.excel.dto
 * @author: Elijah.D
 * @time: CreateAt 2018/11/15 && 14:29
 * @description: 字典模型
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DbInfoDTO extends BaseNeoDTO {
    private static final long serialVersionUID = -3896117441933648416L;

    /**
     * 版本信息
     */
    private String dbVersion;

    /**
     * 数据库中文名字
     */
    private String dbChineseName;

    /**
     * 数据库注释
     */
    private String dbComment;

    /**
     * 表格数量
     */
    private Integer tableNum;

    /**
     * 用户数量
     */
    private Integer userNum;

    /**
     * 空间大小
     */
    private Long sortN;

    /**
     * 数据库业务类型 - 关系
     */
    private List<Object> businessType;
}
