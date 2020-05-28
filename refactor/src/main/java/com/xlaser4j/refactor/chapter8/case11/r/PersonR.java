package com.xlaser4j.refactor.chapter8.case11.r;

import java.util.Collections;
import java.util.Set;

import com.xlaser4j.refactor.chapter8.case11.o.Course11;

/**
 * @package: com.xlaser4j.refactor.chapter8.case11.o
 * @author: Elijah.D
 * @time: 5/18/2020 6:38 PM
 * @description:
 * @modified: Elijah.D
 */
public class PersonR {
    private Set<Course11> cours;

    /**
     * 提供一个不可修改的集合副本,数据的修改必须是通过add/remove方法;保证数据的封装性
     *
     * @return unmodifiableSet
     */
    public Set<Course11> getCours() {
        return Collections.unmodifiableSet(cours);
    }

    public void setCours(Set<Course11> cours) {
        this.cours.addAll(cours);
    }

    public void addCourse(Course11 course11) {
        this.cours.add(course11);
    }

    public void removeCourse(Course11 course11) {
        this.cours.remove(course11);
    }
}
