package com.department.department_management.cleanarchitecture.usecase.boundary;

import com.department.department_management.cleanarchitecture.usecase.model.DepartmentDsRequestModel;

public interface DepartmentDsGateway {
    boolean existsByName(String name);

    void save(DepartmentDsRequestModel departmentDsRequestModel);
}
