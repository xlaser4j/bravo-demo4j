package com.xlasers.hutool.excel;

import java.util.ArrayList;
import java.util.List;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.xlasers.hutool.excel.dto.ColumnInfoDTO;
import com.xlasers.hutool.excel.dto.DbInfoDTO;
import com.xlasers.hutool.excel.dto.TableInfoDTO;
import com.xlasers.hutool.excel.dto.ViewInfoDTO;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * app: 应用入口
 * </p>
 *
 * @package: com.xlasers.hutool.excel
 * @author: Elijah.D
 * @time: CreateAt 2018/11/15 && 14:29
 * @description: 主程序, app
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class App {
    public static void main(String[] args) {

        List<BaseNeoDO> data = CollUtil.newArrayList();

        ExcelReader reader = ExcelUtil.getReader("C:/Users/Solor/Desktop/Code/future/bravo-demos/hutool/Import_Model.xlsx");
        log.info("【获取excel下sheet名字】:{}", reader.getSheetNames());

        List<DbInfoDTO> dtos = reader.setSheet("Db").read(0, 1, DbInfoDTO.class);
        log.info("【dtos】:{}", dtos);

        List<DbInfo> dos = new ArrayList<>(dtos.size());
        dtos.forEach(dto -> {
            DbInfo db = new DbInfo();
            BeanUtil.copyProperties(dto, db,CopyOptions.create().setIgnoreError(true));
            dos.add(db);
        });

        log.info("【dos】:{}", dos);

        List<TableInfoDTO> tables = reader.setSheet("Table").read(0, 1, TableInfoDTO.class);
        List<ViewInfoDTO> views = reader.setSheet("View").read(0, 1, ViewInfoDTO.class);
        List<ColumnInfoDTO> columns = reader.setSheet("Column").read(0, 1, ColumnInfoDTO.class);

        log.info("【解析成JavaBean】:{}", data);

        log.info("【解析成Json】:{}", JSONUtil.parseArray(data));
    }
}
