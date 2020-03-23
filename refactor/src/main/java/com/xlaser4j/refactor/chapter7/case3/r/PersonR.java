package com.xlaser4j.refactor.chapter7.case3.r;

/**
 * @package: com.xlaser4j.refactor.chapter7.case3.o
 * @author: Elijah.D
 * @time: 2020/3/23 13:48
 * @description:
 * @modified: Elijah.D
 */
public class PersonR {
    private String name;

    private Telephone telephone;

    /**
     * Note:<b>Move Method,Move Field</b>一步步移动即可
     * <p>
     * 根据情况选择是否公开Telephone这个类
     *
     * @return
     */
    public String getTelephoneNumber() {
        return telephone.getTelephoneNumber();
    }

    /**
     * Note:利用<b>Extract Class: 提炼类</b>重构
     * <p>
     * 提取Telephone类,通过get方法建立连接
     *
     * @return
     */
    public Telephone getTelephone() {
        return telephone;
    }
}
