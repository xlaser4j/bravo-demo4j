package com.xlasers.hutool.excel;

import java.io.Serializable;

import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.xlasers.hutool.excel
 * @author: Elijah.D
 * @time: CreateAt 2018/11/15 && 14:29
 * @description:
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Data
public abstract class BaseNeoDO implements Serializable {
    private static final long serialVersionUID = 2090859342042139331L;

    /**
     * 主键
     */
    private String id;

    /**
     * 作业id
     */
    private Long jobId;

    /**
     * 作业名称
     */
    private String jobName;

    /**
     * 元数据名称
     */
    private String metaName;

    /**
     * 数据库类型
     */
    private Integer configType;

    /**
     * db 名字
     */
    private String dbName;

    /**
     * IP
     */
    private String host;

    /**
     * 端口
     */
    private String port;

    /**
     * 上下文路径
     */
    private String contextPath;

    /**
     * 生效时间
     */
    private Long createAt;

    /**
     * 更新时间
     */
    private Long updateAt;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 修改者
     */
    private String updateBy;

    /**
     * 版本号记录
     */
    private Integer version;
}
