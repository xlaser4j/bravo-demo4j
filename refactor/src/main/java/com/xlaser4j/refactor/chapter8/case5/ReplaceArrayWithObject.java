package com.xlaser4j.refactor.chapter8.case5;

/**
 * @package: com.xlaser4j.refactor.chapter8.case5
 * @author: Elijah.D
 * @time: 2020/4/3 16:54
 * @description: 以对象取代数组
 * @modified: Elijah.D
 */
public class ReplaceArrayWithObject {
    public static void main(String[] args) {
        System.out.println("数组是一种创建的数据结构,但是应该只用于某种顺序容纳一组相似对象,如果发现容纳多种不同的" +
                "含义内容,需要提取对象来处理,这样不需要记忆数组的内容;如一个数组三个元素表示球队名,胜次,败次");
    }
}
