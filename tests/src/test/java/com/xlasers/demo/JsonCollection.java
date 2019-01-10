package com.xlasers.demo;

import java.util.List;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import com.xlasers.demo.model.Arrow;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.xlasers.demo
 * @author: Elijah.D
 * @time: CreateAt 2019/1/10 && 17:35
 * @description:
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class JsonCollection {
    /**
     * Test case 1.
     *
     * <P>hutool的toList方法
     */
    @Test
    void testCase1() {
        JSONArray fkArrows = JSONUtil.parseArray(
                "[" +
                "{\"source\": \"table-oracle@192.168.226.27@1521@orcl@DW_HOS@T_SFXMXJ_DM\",\"sourceDeleted\": false,\"target\": \"table-oracle@192.168.226.27@1521@orcl@XTGL@GY_YLSF\",\"targetDeleted\": false,\"value\": \"etl\"}," +
                "{\"source\": \"table-oracle@192.168.226.27@1521@orcl@DW_HOS@T_SFXMXJ_DM\",\"sourceDeleted\": false,\"target\": \"table-oracle@192.168.226.27@1521@orcl@MZXT@MZ_YJK2\",\"targetDeleted\": false,\"value\": \"etl\"}" +
                        "]");
        log.info("【fkArrows】:{}",fkArrows);

        List<Arrow> arrows = JSONUtil.toList(fkArrows, Arrow.class);
        log.info("【arrows】:{}", arrows);
    }
}
