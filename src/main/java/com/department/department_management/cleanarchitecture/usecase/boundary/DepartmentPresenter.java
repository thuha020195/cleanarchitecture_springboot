package com.department.department_management.cleanarchitecture.usecase.boundary;

import com.department.department_management.cleanarchitecture.usecase.model.DepartmentResponseModel;

public interface DepartmentPresenter {
    DepartmentResponseModel prepareSuccessView(DepartmentResponseModel departmentResponseModel);

    DepartmentResponseModel prepareFailView(String error);
}
