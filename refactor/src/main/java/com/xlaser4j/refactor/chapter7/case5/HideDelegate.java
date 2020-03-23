package com.xlaser4j.refactor.chapter7.case5;

/**
 * @package: com.xlaser4j.refactor.chapter7.case5
 * @author: Elijah.D
 * @time: 2020/3/23 14:28
 * @description:
 * @modified: Elijah.D
 */
public class HideDelegate {
    public static void main(String[] args) {
        System.out.println("封装作为对象的最关键特征之一,目的就是减少每个对象对其他系统细节的了解;" +
                "耦合的内容越少,系统发生变化时修改的就越容易;如果程序中有委托调用的关系,可以考虑使用HideDelegate" +
                "这个恰好又与RemoveMiddleMan相反,需要更具委托的数量等视情况而定考虑合适得策略");
    }
}
