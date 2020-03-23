package com.xlaser4j.refactor.chapter7.case8;

/**
 * @package: com.xlaser4j.refactor.chapter7.case8
 * @author: Elijah.D
 * @time: 2020/3/23 15:29
 * @description:
 * @modified: Elijah.D
 */
public class IntroduceLocalExtension {
    public static void main(String[] args) {
        System.out.println("当外加函数过多时,就考虑使用引入本地扩展重构,减少零散的外加,降低复杂度,集中管理理解" +
                "本地扩展通常使用子类化subclassing或者包装类wrapping实现,优先选择subclassing简单易实现" +
                "???=== wrapping似乎是特殊情况才会用,允许修改源对象时候采用 == ???" +
                "仍然以: Date不满足需求为例,扩展一个nextDay()");
    }
}
