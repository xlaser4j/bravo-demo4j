package com.xlaser4j.refactor.chapter7.case6;

import com.xlaser4j.refactor.chapter7.case5.o.Department;

/**
 * @package: com.xlaser4j.refactor.chapter7.case5.o
 * @author: Elijah.D
 * @time: 2020/3/23 14:31
 * @description:
 * @modified: Elijah.D
 */
public class Person {
    private String name;

    private Department department;

    /**
     * <code>elijah.getManager()</code>
     * <p>
     * HideDelegate隐藏委托关系也是有代价的,如果一个类中委托过多,就要添加过多的委托函数,随着委托内容越来越多,最终
     * 服务类变成一个"中间人"
     *
     * @return
     */
    public String getManager() {
        return department.getManager();
    }

    static class PersonR {
        private String name;

        private Department department;

        /**
         * <code>elijah.getDepartment().getManager()</code>
         * <p>
         * 当委托关系过多,服务类臃肿不堪,可以考虑使用:<b>Remove Middle Man: 移除中间人</b>重构,通过委托对象调用
         * <p>
         * 注意视情况而定,如果department委托过多就需要remove而直接委托调用
         *
         * @return
         */
        public Department getDepartment() {
            return department;
        }
    }
}
