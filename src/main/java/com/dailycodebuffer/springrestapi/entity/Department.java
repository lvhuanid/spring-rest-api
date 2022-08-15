package com.dailycodebuffer.springrestapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
    private String departmentAddradd;
    private String departmentCode;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getdepartmentName() {
        return departmentName;
    }

    public void setdepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddradd() {
        return departmentAddradd;
    }

    public void setDepartmentAddradd(String departmentAddradd) {
        this.departmentAddradd = departmentAddradd;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Department(Long departmentId, String departmentName, String departmentAddradd, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddradd = departmentAddradd;
        this.departmentCode = departmentCode;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddradd='" + departmentAddradd + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }
}
