package com.department.department_management.cleanarchitecture.entity;

public class CommonDepartment implements Department {
    String name;

    CommonDepartment(String name) {
        this.name = name;
    }

    CommonDepartment() {
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean nameIsValid() {
        return name != null && name.length() > 5;
    }
}
