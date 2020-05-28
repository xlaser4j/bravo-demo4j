package com.xlaser4j.refactor.chapter8.case15;

/**
 * @package: com.xlaser4j.refactor.chapter8.case15
 * @author: Elijah.D
 * @time: 5/20/2020 10:30 AM
 * @description: 以State/Strategy取代类型码
 * @modified: Elijah.D
 */
public class ReplaceTypeCodeWithStateOrStrategy {
    public static void main(String[] args) {
        System.out.println("当类型码的值在对象生命期中发生变化,或其他原因是的数组类不能被继承时,就不能使用上面的使用" +
                "子类重构;可以考虑使用状态或者策略模式");
    }
}
