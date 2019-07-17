package com.qy.ebws.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by Because of you on 2019/7/16.
 */
public class Jfxx {
    private String jfbh;//缴费业务编号
    private String jbbm;//经办业务部门
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date slsj;//业务受理时间
    private String jfr;//缴费人
    private String sfxm;//收费项目
    private String sfje;//收费金额
    private String zje;//收费总金额

    public Jfxx() {
    }

    public Jfxx(String jfbh, String jbbm, Date slsj, String jfr, String sfxm, String sfje, String zje) {
        this.jfbh = jfbh;
        this.jbbm = jbbm;
        this.slsj = slsj;
        this.jfr = jfr;
        this.sfxm = sfxm;
        this.sfje = sfje;
        this.zje = zje;
    }

    public void setJfbh(String jfbh) {
        this.jfbh = jfbh;
    }

    public void setJbbm(String jbbm) {
        this.jbbm = jbbm;
    }

    public void setSlsj(Date slsj) {
        this.slsj = slsj;
    }

    public void setJfr(String jfr) {
        this.jfr = jfr;
    }

    public void setSfxm(String sfxm) {
        this.sfxm = sfxm;
    }

    public void setSfje(String sfje) {
        this.sfje = sfje;
    }

    public void setZje(String zje) {
        this.zje = zje;
    }

    public String getJfbh() {
        return jfbh;
    }

    public String getJbbm() {
        return jbbm;
    }

    public Date getSlsj() {
        return slsj;
    }

    public String getJfr() {
        return jfr;
    }

    public String getSfxm() {
        return sfxm;
    }

    public String getSfje() {
        return sfje;
    }

    public String getZje() {
        return zje;
    }

    @Override
    public String toString() {
        return "Jfxx{" +
                "jfbh='" + jfbh + '\'' +
                ", jbbm='" + jbbm + '\'' +
                ", slsj=" + slsj +
                ", jfr='" + jfr + '\'' +
                ", sfxm='" + sfxm + '\'' +
                ", sfje='" + sfje + '\'' +
                ", zje='" + zje + '\'' +
                '}';
    }
}
