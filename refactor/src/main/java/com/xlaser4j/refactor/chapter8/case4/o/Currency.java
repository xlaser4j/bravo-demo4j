package com.xlaser4j.refactor.chapter8.case4.o;

/**
 * @package: com.xlaser4j.refactor.chapter8.case4.o
 * @author: Elijah.D
 * @time: 2020/4/3 16:47
 * @description:
 * @modified: Elijah.D
 */
public class Currency {
    private String code;

    private Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    /// new Currency("usd").equals(new Currency("usd"))  false
}
