package com.xlaser4j.refactor.chapter6.case7.o;

/**
 * @package: com.xlaser4j.refactor.chapter6.case7.o
 * @author: Elijah.D
 * @time: 2020/3/20 15:23
 * @description:
 * @modified: Elijah.D
 */
public class RemoveAssignmentsToParameters {
    public int discount(int inputVal, int quantity, int yearToDate) {
        if (inputVal > 50) {
            inputVal -= 2;
        }
        if (quantity > 100) {
            inputVal -= 1;
        }
        if (yearToDate > 1000) {
            inputVal -= 4;
        }

        return inputVal;
    }
}
