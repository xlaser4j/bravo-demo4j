package com.xlaser.excel.excel;

import java.util.ArrayList;
import java.util.List;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.xlaser.excel.excel.dto.ColumnInfoDTO;
import com.xlaser.excel.excel.dto.DbInfoDTO;
import com.xlaser.excel.excel.dto.TableInfoDTO;
import com.xlaser.excel.excel.dto.ViewInfoDTO;
import com.xlaser.excel.util.BeanUtils;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * app: 应用入口
 * </p>
 *
 * @package: com.xlaser.excel.excel
 * @author: Elijah.D
 * @time: CreateAt 2018/11/15 && 14:29
 * @description: 主程序, app
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class App {
	public static void main(String[] args) {
		List<BaseNeoDO> data = CollUtil.newArrayList();

		ExcelReader reader = ExcelUtil.getReader("C:/Users/Solor/Desktop/Code/future/bravo-demos/excel/Import_Model.xlsx");
		log.info("【获取excel下sheet名字】:{}", reader.getSheetNames());

		// db
		List<DbInfoDTO> dbDTOs = reader.setSheet("Db").read(0, 1, DbInfoDTO.class);
		List<DbInfo> dbs = new ArrayList<>(dbDTOs.size());
		dbDTOs.forEach(o -> {
			DbInfo db = new DbInfo();
			BeanUtils.copy(o, db);
			dbs.add(db);
		});

		// table
		List<TableInfoDTO> tableDTOs = reader.setSheet("Table").read(0, 1, TableInfoDTO.class);
		List<TableInfo> tables = new ArrayList<>(tableDTOs.size());
		tableDTOs.forEach(o -> {
			TableInfo table = new TableInfo();
			BeanUtils.copy(o, table);
			tables.add(table);
		});

		// view
		List<ViewInfoDTO> viewDTOs = reader.setSheet("View").read(0, 1, ViewInfoDTO.class);
		List<ViewInfo> views = new ArrayList<>(viewDTOs.size());
		viewDTOs.forEach(o -> {
			ViewInfo view = new ViewInfo();
			BeanUtils.copy(o, view);
			views.add(view);
		});

		// column
		List<ColumnInfoDTO> columnDTOs = reader.setSheet("Column").read(0, 1, ColumnInfoDTO.class);
		List<ColumnInfo> columns = new ArrayList<>(columnDTOs.size());
		columnDTOs.forEach(o -> {
			ColumnInfo column = new ColumnInfo();
			BeanUtils.copy(o, column);
			columns.add(column);
		});

		data.addAll(dbs);
		data.addAll(tables);
		data.addAll(views);
		data.addAll(columns);

		log.info("【解析成Json】:{}", JSONUtil.parseArray(data));
	}
}
