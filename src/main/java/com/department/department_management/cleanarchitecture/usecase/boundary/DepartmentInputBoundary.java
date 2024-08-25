package com.department.department_management.cleanarchitecture.usecase.boundary;

import com.department.department_management.cleanarchitecture.usecase.model.DepartmentRequestModel;
import com.department.department_management.cleanarchitecture.usecase.model.DepartmentResponseModel;

public interface DepartmentInputBoundary {
    DepartmentResponseModel create(DepartmentRequestModel departmentRequestModel);
}
