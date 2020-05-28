package com.xlaser4j.refactor.chapter8.case11.o;

import java.util.HashSet;
import java.util.Set;

/**
 * @package: com.xlaser4j.refactor.chapter8.case11.o
 * @author: Elijah.D
 * @time: 5/18/2020 6:38 PM
 * @description:
 * @modified: Elijah.D
 */
public class Person11 {
    private Set<Course11> courses;

    public Set<Course11> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course11> courses) {
        this.courses = courses;
    }

    public void doSomthing() {
        Person11 kent = new Person11();
        Set<Course11> kentCourses = new HashSet<>();
        kentCourses.add(new Course11("Smalltalk Programming", false));
        kentCourses.add(new Course11("Appreciating Single Malts", true));
        kent.setCourses(kentCourses);

        Course11 refactor = new Course11("Refactoring", true);
        kent.getCourses().add(refactor);
        kent.getCourses().add(new Course11("Brutal Sarcasm", false));

        kent.getCourses().remove(refactor);
    }
}
