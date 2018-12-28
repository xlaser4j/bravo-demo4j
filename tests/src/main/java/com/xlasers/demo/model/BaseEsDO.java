package com.xlasers.demo.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class BaseEsDO implements Serializable {
    private static final long serialVersionUID = 4355829555797280442L;

    /**
     * 主键
     */
    private String id;

    /**
     * 作业id
     */
    private Long jobId;

    /**
     * 元数据名称
     */
    private String metaName;

    /**
     * 作业名称(采集名称)
     */
    private String jobName;

    /**
     * 数据库类型
     */
    private Integer configType;

    /**
     * db 名字
     */
    private String dbName;

    /**
     * 用户名
     */
    private String username;

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

    /**
     * 0 大小写不敏感 1 大小写敏感
     */
    private Integer caseWrite;

    /**
     * 是否逻辑删除
     */
    private Boolean isDeleted;
}
