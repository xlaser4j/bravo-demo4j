package com.xlaser4j.refactor.chapter8.case2;

/**
 * @package: com.xlaser4j.refactor.chapter8.case2
 * @author: Elijah.D
 * @time: 2020/3/31 15:44
 * @description: 以对象取代数据值
 * @modified: Elijah.D
 */
public class ReplaceDataValueWithObject {
    public static void main(String[] args) {
        System.out.println("开发初期,业务没那么复杂时,往往会在一个类中添加一个简单的属性,但是随着后续的业务开发," +
                "这个简单的属性需要做扩展,这个时候不应该继续添加字段,或者类似于拼接处理,如电话号码,后续演变成区号" +
                "具体号码等业务,应该把属性提取成一个类");
    }
}
