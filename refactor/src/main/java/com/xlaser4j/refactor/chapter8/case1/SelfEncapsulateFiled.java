package com.xlaser4j.refactor.chapter8.case1;

/**
 * @package: com.xlaser4j.refactor.chapter8.case1
 * @author: Elijah.D
 * @time: 2020/3/31 15:33
 * @description: 自封装字段
 * @modified: Elijah.D
 */
public class SelfEncapsulateFiled {
    public static void main(String[] args) {
        System.out.println("对于字段属性,我们通常使用get/set方法操作,即使在一个类中定义的字段,也建议使用" +
                "get/set方法处理;可以在很容易添加处理一些逻辑,如校验,延迟初始化等,尤其是作为父类的时候,方便子类复写");
    }
}
