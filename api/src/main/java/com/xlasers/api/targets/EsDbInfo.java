package com.xlasers.api.targets;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
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
