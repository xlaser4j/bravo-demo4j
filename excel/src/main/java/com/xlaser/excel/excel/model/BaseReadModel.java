package com.xlaser.excel.excel.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.xlaser.excel.excel.model
 * @author: Elijah.D
 * @time: CreateAt 2019/1/18 && 17:34
 * @description:
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Data
public class BaseReadModel extends BaseRowModel {
	@ExcelProperty(index = 0)
	protected String str;

	@ExcelProperty(index = 1)
	protected Float ff;
}