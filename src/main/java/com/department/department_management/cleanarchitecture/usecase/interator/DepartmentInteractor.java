package com.department.department_management.cleanarchitecture.usecase.interator;

import com.department.department_management.cleanarchitecture.entity.Department;
import com.department.department_management.cleanarchitecture.entity.DepartmentFactory;
import com.department.department_management.cleanarchitecture.usecase.model.DepartmentDsRequestModel;
import com.department.department_management.cleanarchitecture.usecase.model.DepartmentRequestModel;
import com.department.department_management.cleanarchitecture.usecase.model.DepartmentResponseModel;
import com.department.department_management.cleanarchitecture.usecase.boundary.DepartmentDsGateway;
import com.department.department_management.cleanarchitecture.usecase.boundary.DepartmentInputBoundary;
import com.department.department_management.cleanarchitecture.usecase.boundary.DepartmentPresenter;

import java.time.LocalDateTime;

public class DepartmentInteractor implements DepartmentInputBoundary {
    final DepartmentDsGateway departmentDsGateway;
    final DepartmentPresenter departmentPresenter;
    final DepartmentFactory departmentFactory;

    public DepartmentInteractor(DepartmentDsGateway departmentDsGateway, DepartmentPresenter departmentPresenter, DepartmentFactory departmentFactory) {
        this.departmentDsGateway = departmentDsGateway;
        this.departmentPresenter = departmentPresenter;
        this.departmentFactory = departmentFactory;
    }

    @Override
    public DepartmentResponseModel create(DepartmentRequestModel departmentRequestModel) {
        if (departmentDsGateway.existsByName(departmentRequestModel.getName())) {
            return departmentPresenter.prepareFailView("Department already exist");
        }

        Department department = departmentFactory.create(departmentRequestModel.getName());

        if (!department.nameIsValid()) {
            return departmentPresenter.prepareFailView("Department name must have more than 5 characters");
        }

        LocalDateTime now = LocalDateTime.now();
        DepartmentDsRequestModel departmentDsRequestModel = new DepartmentDsRequestModel(department.getName(), now);

        departmentDsGateway.save(departmentDsRequestModel);

        DepartmentResponseModel departmentResponseModel = new DepartmentResponseModel(department.getName(), now.toString());
        return departmentPresenter.prepareSuccessView(departmentResponseModel);
    }
}
