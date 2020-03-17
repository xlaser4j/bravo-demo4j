package com.xlaser4j.refactor.chapter1.case1.origin;

/**
 * @package: com.xlaser4j.refactor.chapter1.case1.origin
 * @author: Elijah.D
 * @time: 2020/3/17 14:54
 * @description: 电影CD
 * @modified: Elijah.D
 */
public class Movie {
    /**
     * 普通类别
     */
    public static final int REGULAR = 0;

    /**
     * 新上映
     */
    public static final int NEW_RELEASE = 1;

    /**
     * 儿童片
     */
    public static final int CHILDREN = 2;

    /**
     * 电影名称
     */
    private String title;

    /**
     * 租赁价格
     */
    private int price;

    public Movie(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
