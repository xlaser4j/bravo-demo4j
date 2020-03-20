package com.xlaser4j.refactor.chapter6.case5.o;

/**
 * @package: com.xlaser4j.refactor.chapter6.case5.o
 * @author: Elijah.D
 * @time: 2020/3/20 11:24
 * @description:
 * @modified: Elijah.D
 */
public class IntroduceExplainingVariable {
    String platform;

    String browser;

    int quantity;

    int itemPrice;

    int resize;

    public void test() {
        if (platform.toUpperCase().contains("MAC") && browser.toUpperCase().contains("IE") && resize > 0) {
            System.out.println("将复杂表达式的结果放进一个临时变量,以此变量名称来解释表达式用途");
        }
    }

    public double price() {
        // price is base price - quantity discount + shipping
        return quantity * itemPrice -
                Math.max(0, quantity - 500) * itemPrice * 0.05 +
                Math.min(quantity * itemPrice * 0.1, 100.0);
    }
}
