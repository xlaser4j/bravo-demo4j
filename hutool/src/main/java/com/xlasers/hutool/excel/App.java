package com.xlasers.hutool.excel;

import java.util.List;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
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

        ExcelReader reader = ExcelUtil.getReader("C:\\Users\\Solor\\Desktop\\Code\\future\\bravo-demos\\hutool\\Import-Model.xlsx");

        log.info("【获取excel下sheet名字】:{}", reader.getSheetNames());

        List<DbInfo> all = reader.read(0, 2, DbInfo.class);
        log.info("【读取excel数据】:{}", all);
    }
}
