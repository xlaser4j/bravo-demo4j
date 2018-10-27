package com.xlasers.api.targets;

import java.io.Serializable;

import lombok.Data;

/**
 * <p>
 * es 实体基类
 * </p>
 *
 * @package: com.mchz.datamanager.entity.neo4j
 * @description: es 实体基类
 * @author: yangkai.shen
 * @date: Created in 2018/10/23 22:19
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
public class BaseEsDO implements Serializable {
	/**
	 * 主键
	 */
	private String id;

	/**
	 * 作业id
	 */
	private Long jobId;

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
