package com.xlasers.demo;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * <p>
 * map: map相关
 * </p>
 *
 * @package: com.xlasers.demo
 * @author: Elijah.D
 * @time: CreateAt 2018/12/5 && 14:40
 * @description: 测试map
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class MapCollection {
    /**
     * Test case 1.
     *
     * <P>测试multiMap
     */
    @Test
    void testCase1() {
        Multimap<String, String> stringMap = ArrayListMultimap.create();
        stringMap.put("1", "one");
        stringMap.put("1", "one");
        stringMap.put("2", "one");
        stringMap.put("1", "two");
        stringMap.put("1", "two");
        log.info("【stringMap】:{}", stringMap);
        log.info("【stringMap-as】:{}", stringMap.asMap());

        stringMap.clear();
        log.info("【stringMap】:{}", stringMap);

        Multimap<Integer, Integer> integerMap = ArrayListMultimap.create();
        integerMap.put(1, 1);
        integerMap.put(1, 2);
        integerMap.put(2, 2);
        integerMap.put(1, 1);
        log.info("【integerMap】:{}", integerMap);

        integerMap.put(3, null);
        integerMap.put(3, 3);
        log.info("【integerMap】:{}", integerMap);
    }
}
