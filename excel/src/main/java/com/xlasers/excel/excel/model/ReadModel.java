package com.xlasers.excel.excel.model;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.xlasers.excel.excel.model
 * @author: Elijah.D
 * @time: CreateAt 2019/1/18 && 17:33
 * @description:
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
public class ReadModel extends BaseReadModel {

    @ExcelProperty(index = 2)
    private Integer mm;

    @ExcelProperty(index = 3)
    private BigDecimal money;

    @ExcelProperty(index = 4)
    private Long times;

    @ExcelProperty(index = 5)
    private Double activityCode;

    @ExcelProperty(index = 6,format = "yyyy-MM-dd")
    private Date date;

    @ExcelProperty(index = 7)
    private String lx;

    @ExcelProperty(index = 8)
    private String name;

    @ExcelProperty(index = 18)
    private String kk;


    public Integer getMm() {
        return mm;
    }

    public void setMm(Integer mm) {
        this.mm = mm;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Long getTimes() {
        return times;
    }

    public void setTimes(Long times) {
        this.times = times;
    }

    public Double getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(Double activityCode) {
        this.activityCode = activityCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKk() {
        return kk;
    }

    public void setKk(String kk) {
        this.kk = kk;
    }

    @Override
    public String toString() {
        return "JavaModel{" +
                "str='" + str + '\'' +
                ", ff=" + ff +
                ", mm=" + mm +
                ", money=" + money +
                ", times=" + times +
                ", activityCode=" + activityCode +
                ", date=" + date +
                ", lx='" + lx + '\'' +
                ", name='" + name + '\'' +
                ", kk='" + kk + '\'' +
                '}';
    }
}