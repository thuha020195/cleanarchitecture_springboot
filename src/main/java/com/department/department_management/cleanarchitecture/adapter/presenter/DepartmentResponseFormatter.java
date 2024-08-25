package com.department.department_management.cleanarchitecture.adapter.presenter;

import com.department.department_management.cleanarchitecture.usecase.boundary.DepartmentPresenter;
import com.department.department_management.cleanarchitecture.usecase.model.DepartmentResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DepartmentResponseFormatter implements DepartmentPresenter {
    @Override
    public DepartmentResponseModel prepareSuccessView(DepartmentResponseModel departmentResponseModel) {
        LocalDateTime responseTime = LocalDateTime.parse(departmentResponseModel.getCreationTime());
        departmentResponseModel.setCreationTime(responseTime.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        return departmentResponseModel;
    }

    @Override
    public DepartmentResponseModel prepareFailView(String error) {
        throw new ResponseStatusException(HttpStatus.CONFLICT, error);
    }
}
