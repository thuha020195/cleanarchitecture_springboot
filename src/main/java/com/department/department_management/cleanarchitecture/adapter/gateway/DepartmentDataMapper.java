package com.department.department_management.cleanarchitecture.adapter.gateway;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="department")
public class DepartmentDataMapper {
    @Id
    private String name;

    LocalDateTime creationTime;

    public DepartmentDataMapper() {
    }

    public DepartmentDataMapper(String name, LocalDateTime creationTime) {
        super();
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
