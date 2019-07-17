package com.qy.ebws.entity;

/**
 * Created by Because of you on 2019/7/16.
 */
public class Result {
    private Integer fhjg;
    private String fhxx;

    public Result() {
    }

    public Result(Integer fhjg, String fhxx) {
        this.fhjg = fhjg;
        this.fhxx = fhxx;
    }

    public void setFhjg(Integer fhjg) {
        this.fhjg = fhjg;
    }

    public void setFhxx(String fhxx) {
        this.fhxx = fhxx;
    }

    public Integer getFhjg() {
        return fhjg;
    }

    public String getFhxx() {
        return fhxx;
    }

    @Override
    public String toString() {
        return "Result{" +
                "fhjg=" + fhjg +
                ", fhxx='" + fhxx + '\'' +
                '}';
    }
}
