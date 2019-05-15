package com.xlaser.excel.excel.model;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.xlaser.excel.excel.model
 * @author: Elijah.D
 * @time: CreateAt 2019/1/18 && 17:33
 * @description:
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Data
public class ReadModel extends BaseReadModel {
	@ExcelProperty(index = 2)
	private Integer mm;

	@ExcelProperty(index = 3)
	private BigDecimal money;

	@ExcelProperty(index = 4)
	private Long times;

	@ExcelProperty(index = 5)
	private Double activityCode;

	@ExcelProperty(index = 6, format = "yyyy-MM-dd")
	private Date date;

	@ExcelProperty(index = 7)
	private String lx;

	@ExcelProperty(index = 8)
	private String name;

	@ExcelProperty(index = 18)
	private String kk;
}