package com.xlaser4j.refactor.chapter8.case4.r;

/**
 * @package: com.xlaser4j.refactor.chapter8.case4.o
 * @author: Elijah.D
 * @time: 2020/4/3 16:47
 * @description:
 * @modified: Elijah.D
 */
public class CurrencyR {
    private String code;

    public CurrencyR(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CurrencyR)) {
            return false;
        }
        CurrencyR other = (CurrencyR)obj;
        return code.equals(other.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }

    /// new Currency("usd").equals(new Currency("usd"))  true
}
