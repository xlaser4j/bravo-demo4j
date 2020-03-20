package com.xlaser4j.refactor.chapter6.case8.o;

/**
 * @package: com.xlaser4j.refactor.chapter6.case8.o
 * @author: Elijah.D
 * @time: 2020/3/20 16:30
 * @description:
 * @modified: Elijah.D
 */
public class ReplaceMethodWithMethodObject {
    /**
     * 假设一个大形函数,局部变量过多,造成无法使用Extract Method重构,可以考虑使用方法对象重构:
     * 将一个函数放进一个对象中,把局部变量换成对象内的字段,然后再分解即可
     *
     * @param inputVal   input
     * @param quantity   quantity
     * @param yearToDate date
     * @return int
     */
    int gamma(int inputVal, int quantity, int yearToDate) {
        int importantValue1 = (inputVal * quantity) + delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
        int importantValue3 = importantValue2 * 7;

        // and so on.
        return importantValue3 - (2 * importantValue1);
    }

    int delta() {
        return 666;
    }
}
