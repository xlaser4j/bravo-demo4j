package com.xlaser.demo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

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
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class DictInfo implements Serializable {
	private static final long serialVersionUID = -6020081621235570383L;

	/**
	 * 主键
	 */
	private String id;

	/**
	 * 字典编码
	 */
	private String dictCode;

	/**
	 * 字典名称
	 */
	private String dictName;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 类型ID
	 */
	private String typeId;

	/**
	 * 类型编码
	 */
	private String typeCode;

	/**
	 * 类型名称
	 */
	private String typeName;

	/**
	 * 所属类型 - 关系
	 */
	private DictType type;

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

	@Override
	public String toString() {
		return typeCode + "." + dictName;
	}
}
