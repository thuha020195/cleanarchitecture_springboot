package com.department.department_management.cleanarchitecture.entity;

public class CommonDepartmentFactory implements DepartmentFactory {
    @Override
    public Department create(String name) {
        return new CommonDepartment(name);
    }
}
