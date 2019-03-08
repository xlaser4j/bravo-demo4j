package com.xlaser.excel.excel;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * model: 表格
 * </p>
 *
 * @package: com.xlaser.excel.excel
 * @author: Elijah.D
 * @time: CreateAt 2018/11/19 && 9:47
 * @description: 模型, 表格信息
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TableInfo extends BaseNeoDO {
	private static final long serialVersionUID = -2860904792662992680L;

	/**
	 * schema名字
	 */
	private String schemaName;

	/**
	 * 表格名字
	 */
	private String tableName;

	/**
	 * 表格中文名字
	 */
	private String tableChineseName;

	/**
	 * 表格注释
	 */
	private String tableComment;

	/**
	 * 列数量
	 */
	private Integer colNum;

	/**
	 * 字符串列数量
	 */
	private Integer charColNum;

	/**
	 * 数值列数量
	 */
	private Integer numColNum;

	/**
	 * 文本和图像列数量
	 */
	private Integer textColNum;

	/**
	 * 包含时间列数量
	 */
	private Integer dateColNum;

	/**
	 * 表格物理规模
	 */
	private Integer blocks;

	/**
	 * 表格行数
	 */
	private Integer rows;

	/**
	 * 主键和唯一健、唯一索引的数量
	 */
	private Integer pkUniNum;

	/**
	 * 联合主键的最大列数，扣除时间列的列总数
	 */
	private Integer maxPkColNum;

	/**
	 * 外键数量
	 */
	private Integer fkNum;

	/**
	 * 索引数量
	 */
	private Integer idxNum;

	/**
	 * 单列索引名称+列名
	 */
	private List<String> singleIndexDetail;

	/**
	 * 组合索引名称+列名
	 */
	private List<String> combinationIndexDetail;

	/**
	 * 所属数据库 - 关系
	 */
	//@Relationship(value = NeoConsts.R_TABLE_INFO, direction = Relationship.INCOMING)
	private DbInfo dbInfo;

	/**
	 * 表业务类型 - 关系
	 */
	private List<DictInfo> businessType;

	/**
	 * 表行业类型 - 关系
	 */
	private List<DictInfo> industryType;

	/**
	 * 其他属性
	 */
	private List<DictInfo> otherType;

	/**
	 * 模型类型表: 维表、事实表、中间表
	 */
	private List<DictInfo> modelType;

	/**
	 * 内容类型表: 业务流水表、代码表、业务操作表
	 */
	private List<DictInfo> contentType;

	/**
	 * 物理类型表: 外部表、普通表、索引组织表
	 */
	private List<DictInfo> physicalType;
}
