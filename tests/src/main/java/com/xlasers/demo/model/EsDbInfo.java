package com.xlasers.demo.model;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * model
 * </p>
 *
 * @package: com.xlasers.demo.model
 * @author: Elijah.D
 * @time: CreateAt 2018/12/28 && 13:32
 * @description: model
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EsDbInfo extends BaseEsDO {
    private static final long serialVersionUID = 9031977515830760903L;

    /**
     * 数据库类型
     */
    private String dbType;

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
    private List<String> businessType;
}
