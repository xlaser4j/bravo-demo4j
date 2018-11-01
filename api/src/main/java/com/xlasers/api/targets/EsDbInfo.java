package com.xlasers.api.targets;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 测试entity
 * </p>
 *
 * @package: com.xlasers.api.targets
 * @author: Elijah.D
 * @time: CreateAt 2018/11/6 && 15:28
 * @description: 测试yapi
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class EsDbInfo extends BaseEsDO {
    private static final long serialVersionUID = 3903827365997668568L;

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
