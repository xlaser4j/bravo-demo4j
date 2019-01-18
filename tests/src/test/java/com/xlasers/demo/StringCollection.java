package com.xlasers.demo;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <p>
 * test: 测试字符串相关
 * </p>
 *
 * @package: com.xlasers.demo
 * @author: Elijah.D
 * @time: CreateAt 2018/11/26 && 16:31
 * @description: 字符串, 测试
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class StringCollection {
    /**
     * 测试字符串转大写
     */
    @Test
    void testCase1() {
        String from = "13>>27库>>WFBEMR>>TE_MOBANXX";
        assertEquals(from, from.toUpperCase());

        String fromPort = "MOBANLX";
        assertEquals(fromPort, fromPort.toUpperCase());

        String to = "13>>27库>>WFBEMr>>TE_MOBANLX";
        assertEquals("13>>27库>>WFBEMR>>TE_MOBANLX", to.toUpperCase());

        String toPort = "LEIXINgDM";
        assertEquals("LEIXINGDM", toPort.toUpperCase());
    }

    /**
     * <p> 测试hutool-subAfter
     */
    @Test
    void testCase2() {
        String test = "13>>27库>>WFBEMR>>TE_MOBANXX";

        String after1 = StrUtil.subAfter(test, ">>", false);
        log.info("【after1】:{}", after1);

        String after2 = StrUtil.subAfter(test, ">>", true);
        log.info("【after2】:{}", after2);

        String before1 = StrUtil.subBefore(test, ">>", false);
        log.info("【before1】:{}", before1);

        String before2 = StrUtil.subBefore(test, ">>", true);
        log.info("【before2】:{}", before2);

        String source = "table-oracle@192.168.202.2@1521@orcl@SH@EMPLOYEE";
        String prefix = "db-";
        String middle = StrUtil.subAfter(source, "-", false);
        String suffix = StrUtil.subBefore(middle, "@", true);
        String target = StrUtil.builder().append(prefix).append(suffix).toString();
        log.info("【target】:{}", target);
    }

    /**
     * <p> 测试hutool-format
     */
    @Test
    void testCase3() {
        String template1 = "你的名字是: {}";
        String t1 = StrUtil.format(template1, "哈哈", "呵呵");
        log.info("【t1】:{}", t1);

        String template2 = "你的名字是: {{}}";
        String t2 = StrUtil.format(template2, "哈哈", "呵呵");
        log.info("【t2】:{}", t2);
    }
}
