package com.xlaser.excel.excel;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * model: 列信息
 * </p>
 *
 * @package: com.xlaser.excel.excel
 * @author: Elijah.D
 * @time: CreateAt 2018/11/19 && 9:46
 * @description: 模型, 列信息
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ColumnInfo extends BaseNeoDO {
	private static final long serialVersionUID = -2242401020729309143L;

	/**
	 * schema 名字
	 */
	private String schemaName;

	/**
	 * table 名字 / view 名称
	 */
	private String tableName;

	/**
	 * 表格类型，table - 0，view - 1
	 */
	private Integer tableType;

	/**
	 * 列名字
	 */
	private String columnName;

	/**
	 * 列中文名字
	 */
	private String columnChineseName;

	/**
	 * 列注释
	 */
	private String columnComment;

	/**
	 * 列类型
	 */
	private String columnType;

	/**
	 * 是否时间列，0 - 否，1 - 是
	 */
	private Integer isDate;

	/**
	 * 列长度|精度值
	 */
	private String length;

	/**
	 * 最大长度/值
	 */
	private Integer maxLen;

	/**
	 * 最小长度/值
	 */
	private Integer minLen;

	/**
	 * 固定长度
	 */
	private Integer fixLen;

	/**
	 * 计算（生成）方式
	 */
	private String calculateWay;

	/**
	 * 刻度值
	 */
	private Integer scale;

	/**
	 * 长度：十进制数字（数字）或二进制数字（浮点）
	 */
	private Integer dataPrecision;

	/**
	 * 列位置
	 */
	private Integer position;

	/**
	 * 是否主键列，0 - 否，1 - 是
	 */
	private Integer isPk;

	/**
	 * 主键名
	 */
	private String pkName;

	/**
	 * 主键列数量
	 */
	private Integer pkNum;

	/**
	 * 列在主键中的位置
	 */
	private Integer pkPos;

	/**
	 * 是否唯一列，0 - 否，1 - 是
	 */
	private Integer isUnique;

	/**
	 * 唯一约束名字（包括唯一索引）
	 */
	private String uniName;

	/**
	 * 索引列数量
	 */
	private Integer uniNum;

	/**
	 * 列在唯一约束中的位置
	 */
	private Integer uniPos;

	/**
	 * 是否索引列，0 - 否，1 - 是
	 */
	private Integer isIndex;

	/**
	 * 索引信息
	 */
	private List<String> indexDetail;

	/**
	 * 是否外键，0 - 否，1 - 是
	 */
	private Integer isFk;

	/**
	 * 外健名字
	 */
	private String fkName;

	/**
	 * 列在外健中的位置
	 */
	private Integer fkPos;

	/**
	 * 外健引用的表格名
	 */
	private String fkRefTable;

	/**
	 * 外健引用的列名字
	 */
	private String fkRefColumn;

	/**
	 * 约束类型
	 */
	private String constraintType;

	/**
	 * 是否可以为空，0 - 否，1 - 是
	 */
	private Integer nullable;

	/**
	 * 列内容去重后行数
	 */
	private Integer numDistinct;

	/**
	 * 样本数量
	 */
	private Integer sampleSize;

	/**
	 * 是否唯一主键，0 - 否，1 - 是
	 */
	private Integer isUPk;

	/**
	 * 是否联合主键，0 - 否，1 - 是
	 */
	private Integer isCPk;

	/**
	 * 所属表格 - 关系
	 */
	//@Relationship(value = NeoConsts.R_COLUMN_INFO, direction = Relationship.INCOMING)
	private TableInfo tableInfo;

	/**
	 * 主键表 - 关系
	 */
	//@Relationship(value = NeoConsts.R_PK_TABLE)
	private TableInfo pkTableInfo;

	/**
	 * 外键表 - 关系
	 */
	//@Relationship(value = NeoConsts.R_FK_TABLE)
	private TableInfo fkTableInfo;

	/**
	 * 所属视图 - 关系
	 */
	//@Relationship(value = NeoConsts.R_COLUMN_INFO, direction = Relationship.INCOMING)
	private ViewInfo viewInfo;

	/**
	 * 业务类型 - 关系
	 */
	private List<DictInfo> businessType;

	/**
	 * 技术类型 - 关系
	 */
	private List<DictInfo> technicalType;

	/**
	 * 枚举域
	 */
	private List<DictInfo> enumDomains;
}