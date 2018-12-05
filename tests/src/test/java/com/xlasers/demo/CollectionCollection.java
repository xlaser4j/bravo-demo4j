package com.xlasers.demo;

import java.util.Arrays;
import java.util.List;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @package: com.xlasers.demo
 * @author: Elijah.D
 * @time: CreateAt 2018/10/23 && 22:54
 * @description:
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class CollectionCollection {
    /**
     * Test case 1.
     *
     * <P>集合包含方法contains()
     */
    @Test
    void testCase1() {

        List<Long> ids = Arrays.asList(1L, 2L);
        boolean flag = ids.contains(1L);
        // TODO
        log.info("【】{}", flag);
    }

    /**
     * <p> 测试hutool-collUtil
     */
    @Test
    void testCase2() {
        String one = "kettle-12@transformation@ft@T_MS_FYMX_FT@t_ms_fymx_ft 医技";
        List<String> ones = StrUtil.splitTrim(one, "@");
        log.info("【one】:{}", CollUtil.getLast(ones) + "(" + CollUtil.getFirst(ones) + ")");

        String two = "kettle-14@transformation@ft@T_MS_FYMX_FT@t_ms_fymx_ft 医技";
        List<String> twos = StrUtil.splitTrim(two, "@");
        log.info("【two】:{}", CollUtil.getLast(twos) + "(" + CollUtil.getFirst(twos) + ")");
    }
}
