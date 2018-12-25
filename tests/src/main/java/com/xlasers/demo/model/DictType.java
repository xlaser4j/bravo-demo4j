package com.xlasers.demo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * model
 * </p>
 *
 * @package: com.xlasers.demo.model
 * @author: Elijah.D
 * @time: CreateAt 2018/12/28 && 13:32
 * @description: model
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class DictType implements Serializable {
    private static final long serialVersionUID = 3364778794756731569L;

    /**
     * 主键
     */
    private String id;

    /**
     * 类型编码
     */
    private String typeCode;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 备注
     */
    private String remark;

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
}
