package com.xlaser4j.common.response;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @package: com.xlaser4j.common.response
 * @author: Elijah.D
 * @time: 2020/2/10 15:30
 * @description: Page Helper
 * @modified: Elijah.D
 */
@Data
public class PageResponse<T> implements Serializable {
    private static final long serialVersionUID = 2119808948386179415L;

    /**
     * 总记录数
     */
    private long total;

    /**
     * 列表数据
     */
    private List<T> list;
}
