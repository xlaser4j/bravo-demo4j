package com.xlasers.hutool.excel;

import java.io.Serializable;

import lombok.Data;

/**
 * <p>
 * base: neo父类
 * </p>
 *
 * @package: com.xlasers.hutool.excel
 * @author: Elijah.D
 * @time: CreateAt 2018/11/15 && 14:29
 * @description: 父类,通用属性
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Data
public abstract class BaseNeoDTO implements Serializable {
    private static final long serialVersionUID = 2090859342042139331L;

    /**
     * 数据库类型
     */
    private Integer configType;

    /**
     * db 名字
     */
    private String dbName;

    /**
     * IP
     */
    private String host;

    /**
     * 端口
     */
    private String port;

    /**
     * 生效时间
     */
    private Long createAt;

    /**
     * 创建人
     */
    private String createBy;
}
