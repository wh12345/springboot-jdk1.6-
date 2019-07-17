package com.qy.ebws.entity;

import java.util.Date;

/**
 * Created by Because of you on 2019/7/16.
 */
public class RetJfxx {
    private String	jfbh;//缴费业务编号
    private String	jfr;//缴费人
    private double jfje;//缴费金额
    private Date jfsj;//缴费时间

    public RetJfxx() {
    }

    public RetJfxx(String jfbh, String jfr, double  jfje, Date jfsj) {
        this.jfbh = jfbh;
        this.jfr = jfr;
        this.jfje = jfje;
        this.jfsj = jfsj;
    }

    public void setJfbh(String jfbh) {
        this.jfbh = jfbh;
    }

    public void setJfr(String jfr) {
        this.jfr = jfr;
    }

    public void setJfje(double  jfje) {
        this.jfje = jfje;
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

    public double  getJfje() {
        return jfje;
    }

    public Date getJfsj() {
        return jfsj;
    }

    @Override
    public String toString() {
        return "RetJfxx{" +
                "jfbh='" + jfbh + '\'' +
                ", jfr='" + jfr + '\'' +
                ", jfje=" + jfje +
                ", jfsj=" + jfsj +
                '}';
    }
}
