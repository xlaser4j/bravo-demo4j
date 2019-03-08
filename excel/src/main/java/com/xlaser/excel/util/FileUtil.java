package com.xlaser.excel.util;

import java.io.InputStream;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.xlaser.excel.util
 * @author: Elijah.D
 * @time: CreateAt 2019/1/18 && 17:30
 * @description:
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
public class FileUtil {
	public static InputStream getResourcesFileInputStream(String fileName) {

		return cn.hutool.core.io.FileUtil.getInputStream("C:\\Users\\Solor\\Desktop\\Code\\future\\bravo-demos\\excel\\2007.xlsx");
		/// return Thread.currentThread().getContextClassLoader().getResourceAsStream("" + fileName);
	}
}
