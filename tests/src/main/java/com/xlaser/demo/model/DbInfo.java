package com.xlaser.demo.model;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * model
 * </p>
 *
 * @package: com.xlaser.demo.model
 * @author: Elijah.D
 * @time: CreateAt 2018/12/28 && 13:32
 * @description: model
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DbInfo extends BaseNeoDO {
	private static final long serialVersionUID = 8013228015905042919L;

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
	private List<DictInfo> businessType;

	/**
	 * {@code Table} 或者 {@code View} 创建 {@code Db} 对象，不包含 {@code id} 和 {@code contextPath} 属性
	 *
	 * @param neoData {@code Table} 对象或者 {@code View} 对象
	 * @return DbInfo
	 */
	public static <N extends BaseNeoDO> DbInfo buildBaseDbInfo(N neoData) {
		DbInfo dbInfo = new DbInfo();
		dbInfo.setJobId(neoData.getJobId());
		dbInfo.setJobName(neoData.getJobName());
		dbInfo.setMetaName(neoData.getMetaName());
		dbInfo.setDbName(neoData.getDbName());
		dbInfo.setConfigType(neoData.getConfigType());
		dbInfo.setHost(neoData.getHost());
		dbInfo.setPort(neoData.getPort());
		dbInfo.setCreateAt(neoData.getCreateAt());
		dbInfo.setUpdateAt(neoData.getUpdateAt());
		dbInfo.setCreateBy(neoData.getCreateBy());
		dbInfo.setUpdateBy(neoData.getUpdateBy());
		dbInfo.setVersion(neoData.getVersion());
		return dbInfo;
	}
}
