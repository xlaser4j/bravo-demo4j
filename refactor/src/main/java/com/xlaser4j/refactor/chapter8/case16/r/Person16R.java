package com.xlaser4j.refactor.chapter8.case16.r;

/**
 * @package: com.xlaser4j.refactor.chapter8.case16.r
 * @author: Elijah.D
 * @time: 5/28/2020 4:21 PM
 * @description:
 * @modified: Elijah.D
 */
class Person16R {
    private final boolean isMale;

    private final char code;

    protected Person16R(boolean isMale, char code) {
        this.isMale = isMale;
        this.code = code;
    }

    static Person16R createMale() {
        return new Person16R(true, 'M');
    }

    static Person16R createFemale() {
        return new Person16R(false, 'F');
    }

    boolean isMale() {
        return isMale;
    }
}
