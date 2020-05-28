package com.xlaser4j.refactor.chapter8.case13.r;

/**
 * @package: com.xlaser4j.refactor.chapter8.case13.r
 * @author: Elijah.D
 * @time: 5/19/2020 10:08 AM
 * @description:
 * @modified: Elijah.D
 */
public class BloodGroup {
    public static final BloodGroup O = new BloodGroup(0);

    public static final BloodGroup A = new BloodGroup(1);

    public static final BloodGroup B = new BloodGroup(2);

    public static final BloodGroup AB = new BloodGroup(3);

    private static final BloodGroup[] VALUES = {O, A, B, AB};

    private final int code;

    public BloodGroup(int code) {
        this.code = code;
    }

    public static BloodGroup code(int index) {
        return VALUES[index];
    }

    public int getCode() {
        return code;
    }
}
