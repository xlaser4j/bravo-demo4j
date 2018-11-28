package com.xlasers.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * The type Other collection.
 *
 * @package: com.xlasers.demo
 * @author: Elijah.D
 * @time: CreateAt 2018/10/23 && 14:14
 * @description:
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
public class OtherCollection {
    /**
     * Test case 1.
     */
    @Test
    void testCase1() {

        String regx = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$";
    }
}
