package com.xlaser4j.refactor.chapter7.case5.r;

import com.xlaser4j.refactor.chapter7.case5.o.Department;

/**
 * @package: com.xlaser4j.refactor.chapter7.case5.o
 * @author: Elijah.D
 * @time: 2020/3/23 14:31
 * @description:
 * @modified: Elijah.D
 */
public class PersonR {
    private String name;

    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * Note: 利用<b>Hide Delegate: 隐藏委托关系</b>重构
     * <p>
     * <code>elijah.getDepartment().getManager()</code>有耦合,后续委托关系发生变化时,代码改动大
     * <p>
     * <code>elijah.getManager()</code>通过添加函数,隐藏委托关系,后续委托关系发生变化时,只需要改动调用函数即可
     *
     * @return
     */
    public String getManager() {
        return department.getManager();
    }
}
