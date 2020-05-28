package com.xlaser4j.refactor.chapter8.case16.o;

/**
 * @package: com.xlaser4j.refactor.chapter8.case16.o
 * @author: Elijah.D
 * @time: 5/28/2020 4:22 PM
 * @description:
 * @modified: Elijah.D
 */
public class Male16 extends Person16 {
    @Override
    boolean isMale() {
        return true;
    }

    @Override
    char getCode() {
        return 'M';
    }
}
