package com.nuesoft.po;

import java.io.Serializable;

public class Dept implements Serializable {
    private Integer deptid;

    private String deptname;

    public Dept() {
    }

    public Dept(Integer deptid, String deptname) {
        this.deptid = deptid;
        this.deptname = deptname;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }
}