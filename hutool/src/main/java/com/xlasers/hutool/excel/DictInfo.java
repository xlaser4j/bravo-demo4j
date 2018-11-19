package com.xlasers.hutool.excel;

import lombok.Data;

/**
 * <p>
 * model: 字典信息
 * </p>
 *
 * @package: com.xlasers.hutool.excel
 * @author: Elijah.D
 * @time: CreateAt 2018/11/16 && 14:46
 * @description: 模型, 字典信息
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Data
public class DictInfo {
    private static final long serialVersionUID = -8849044685816545024L;

    /**
     * 主键
     */
    private String id;

    /**
     * 字典名称
     */
    private String dictName;

    /**
     * 字典类型
     */
    private String dictType;

    /**
     * 生效时间
     */
    private Long createAt;

    /**
     * 更新时间
     */
    private Long updateAt;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 修改者
     */
    private String updateBy;

    public DictInfo(String dictName, String dictType) {
        this.dictName = dictName;
        this.dictType = dictType;
    }
}
