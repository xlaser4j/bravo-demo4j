package com.xlaser4j.refactor.chapter7.case6;

/**
 * @package: com.xlaser4j.refactor.chapter7.case6
 * @author: Elijah.D
 * @time: 2020/3/23 14:50
 * @description:
 * @modified: Elijah.D
 */
public class RemoveMiddleMan {
    public static void main(String[] args) {
        System.out.println("当一个类中存在大量的委托调用,就不需要使用HideDelegate隐藏委托调用了," +
                "因为大量的委托函数,会是当前服务类变得臃肿不堪,变成一个'中间人',这个时候就需要Remove Middle Man");
    }
}
