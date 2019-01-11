package com.xlasers.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.xlasers.demo.model
 * @author: Elijah.D
 * @time: CreateAt 2019/1/10 && 17:37
 * @description:
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Arrow {
    /**
     * 起始点
     */
    String source;

    /**
     * 逻辑删除{@code true}, 未删除{@code false}
     */
    Boolean sourceDeleted;

    /**
     * 终止点
     */
    String target;

    /**
     * 逻辑删除{@code true}, 未删除{@code false}
     */
    Boolean targetDeleted;

    /**
     * 箭头指向名称
     */
    String value;

    public Arrow(String source, String target, String value) {
        this.source = source;
        this.target = target;
        this.value = value;
    }
}
