package com.department.department_management.cleanarchitecture.usecase.model;

public class DepartmentRequestModel {
    String name;

    public DepartmentRequestModel() {
        super();
    }

    public DepartmentRequestModel(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
