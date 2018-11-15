package com.xlasers.hutool.excel;

import java.util.List;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.xlasers.hutool.excel
 * @author: Elijah.D
 * @time: CreateAt 2018/11/15 && 14:29
 * @description:
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class Main {
    public static void main(String[] args) {

        ExcelReader reader = ExcelUtil.getReader("C:\\Users\\Solor\\Desktop\\Code\\future\\bravo-demos\\hutool\\Import-Model.xlsx");
        List<DbInfo> all = reader.readAll(DbInfo.class);
        log.info("【all】:{}", all.toString());
    }
}
