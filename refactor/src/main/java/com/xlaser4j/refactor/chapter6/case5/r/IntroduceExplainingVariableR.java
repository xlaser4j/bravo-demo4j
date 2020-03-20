package com.xlaser4j.refactor.chapter6.case5.r;

/**
 * @package: com.xlaser4j.refactor.chapter6.case5.o
 * @author: Elijah.D
 * @time: 2020/3/20 11:24
 * @description:
 * @modified: Elijah.D
 */
public class IntroduceExplainingVariableR {
    String platform;

    String browser;

    int quantity;

    int itemPrice;

    int resize;

    /**
     * 利用<b>Introduce Explaining Variable: 引入解释性变量</b>重构.
     * <p>
     * 对于条件逻辑中的表达式,引入final的临时变量来自解释,提高可读性
     */
    public void test() {
        final boolean isMacOs = platform.toUpperCase().contains("MAC");
        final boolean isIe = browser.toUpperCase().contains("IE");
        final boolean wasResized = resize > 0;

        if (isMacOs && isIe && wasResized) {
            System.out.println("将复杂表达式的结果放进一个临时变量,以此变量名称来解释表达式用途");
        }
    }

    /**
     * price = base price - quantity discount + shipping
     * <p>
     * 利用<b>Introduce Explaining Variable => Extract: 引入解释性变量,之后再去除或者直接Extract</b>重构.
     * <pre>
     *         final double basePrice = getBasePrice();
     *         final double discount = getDiscount();
     *         final double shipping = getShipping(basePrice);
     * </pre>
     * 仍然建议使用Extract Method去重构,因为临时变量都是在函数内可用,而方法是在对象的声明周期,
     * 并且可能被其他对象使用,当Extract比较麻烦难以重构时,再使用Introduce
     */
    public double price() {
        return basePrice() - discount() + shipping();
    }

    private double basePrice() {
        return quantity * itemPrice;
    }

    private double discount() {
        return Math.max(0, quantity - 500) * itemPrice * 0.05;
    }

    private double shipping() {
        return Math.min(basePrice() * 0.1, 100.0);
    }
}
