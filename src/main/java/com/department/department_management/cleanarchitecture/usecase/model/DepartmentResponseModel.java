package com.department.department_management.cleanarchitecture.usecase.model;

public class DepartmentResponseModel {
    String name;
    String creationTime;

    public DepartmentResponseModel(String name, String creationTime) {
        this.name = name;
        this.creationTime = creationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}
