package com.nuesoft.po;

import java.io.Serializable;

public class Emp implements Serializable {
    private Integer empid;

    private String empname;

    private String empjob;

    private Integer empwages;

    private Integer empdept;

    private String path;

    private Dept dept;


    public Emp() {
    }

    public Emp(Integer empid, String empname, String empjob, Integer empwages, Integer empdept, String path, Dept dept) {
        this.empid = empid;
        this.empname = empname;
        this.empjob = empjob;
        this.empwages = empwages;
        this.empdept = empdept;
        this.path = path;
        this.dept = dept;
    }

    public Emp(Integer empid, String empname, String empjob, Integer empwages, Integer empdept, String path) {
        this.empid = empid;
        this.empname = empname;
        this.empjob = empjob;
        this.empwages = empwages;
        this.empdept = empdept;
        this.path = path;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getEmpjob() {
        return empjob;
    }

    public void setEmpjob(String empjob) {
        this.empjob = empjob == null ? null : empjob.trim();
    }

    public Integer getEmpwages() {
        return empwages;
    }

    public void setEmpwages(Integer empwages) {
        this.empwages = empwages;
    }

    public Integer getEmpdept() {
        return empdept;
    }

    public void setEmpdept(Integer empdept) {
        this.empdept = empdept;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", empjob='" + empjob + '\'' +
                ", empwages=" + empwages +
                ", empdept=" + empdept +
                ", path='" + path + '\'' +
                ", dept=" + dept +
                '}';
    }
}