package com.xlaser4j.common.security.model;

import lombok.Data;

/**
 * @package: com.xlaser4j.common.security.model
 * @author: Elijah.D
 * @time: 2020/2/9 17:27
 * @description:
 * @modified: Elijah.D
 */
@Data
public class RoleDO {
    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 英文名
     */
    private String name;

    /**
     * 中文名称
     */
    private String chineseName;
}
