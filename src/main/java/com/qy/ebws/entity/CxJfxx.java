package com.qy.ebws.entity;

import java.util.Date;

/**
 * Created by Because of you on 2019/7/16.
 */
public class CxJfxx {
    private String jfbh;//缴费业务编号
    private String jfr;//缴费人
    private Date	jfsj;//缴费时间

    public CxJfxx() {
    }

    public CxJfxx(String jfbh, String jfr, Date jfsj) {
        this.jfbh = jfbh;
        this.jfr = jfr;
        this.jfsj = jfsj;
    }

    public void setJfbh(String jfbh) {
        this.jfbh = jfbh;
    }

    public void setJfr(String jfr) {
        this.jfr = jfr;
    }

    public void setJfsj(Date jfsj) {
        this.jfsj = jfsj;
    }

    public String getJfbh() {
        return jfbh;
    }

    public String getJfr() {
        return jfr;
    }

    public Date getJfsj() {
        return jfsj;
    }

    @Override
    public String toString() {
        return "CxJfxx{" +
                "jfbh='" + jfbh + '\'' +
                ", jfr='" + jfr + '\'' +
                ", jfsj=" + jfsj +
                '}';
    }
}
