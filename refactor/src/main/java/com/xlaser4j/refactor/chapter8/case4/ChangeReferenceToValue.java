package com.xlaser4j.refactor.chapter8.case4;

/**
 * @package: com.xlaser4j.refactor.chapter8.case4
 * @author: Elijah.D
 * @time: 2020/4/3 16:35
 * @description: 将引用对象改为值对象
 * @modified: Elijah.D
 */
public class ChangeReferenceToValue {
    public static void main(String[] args) {
        System.out.println("当值对象难以使用,比如Currency类这个对象有一个属性code返回币种类型,本质上只要code" +
                "相同就是同一个币种,所以可以不用定义成引用对象,可以重写equals/hashcode方法来改成值对象");
    }
}
