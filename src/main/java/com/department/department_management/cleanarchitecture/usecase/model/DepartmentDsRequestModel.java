package com.department.department_management.cleanarchitecture.usecase.model;

import java.time.LocalDateTime;

public class DepartmentDsRequestModel {
    String name;
    LocalDateTime creationTime;

    public DepartmentDsRequestModel(String name, LocalDateTime creationTime) {
        this.name = name;
        this.creationTime = creationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }
}
