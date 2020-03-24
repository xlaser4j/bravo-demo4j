package com.xlaser4j.demo.model;

import java.util.List;

import cn.hutool.core.collection.CollUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @package: com.xlaser4j.demo.model
 * @author: Elijah.D
 * @time: 2020/3/4 10:19
 * @description:
 * @modified: Elijah.D
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonType {
    private String name;

    private Integer age;

    private List<PersonType> children;

    public static List<PersonType> init() {
        PersonType rabbit = new PersonType("Rabbit", 2, null);
        List<PersonType> childR = CollUtil.newArrayList(rabbit);

        PersonType bunny = new PersonType("Bunny", 3, null);
        List<PersonType> childB = CollUtil.newArrayList(bunny);

        return CollUtil.newArrayList(new PersonType("Dad", 30, childR), new PersonType("Mom", 30, childB));
    }
}
