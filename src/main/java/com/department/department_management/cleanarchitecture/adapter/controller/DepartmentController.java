package com.department.department_management.cleanarchitecture.adapter.controller;

import com.department.department_management.cleanarchitecture.usecase.boundary.DepartmentInputBoundary;
import com.department.department_management.cleanarchitecture.usecase.model.DepartmentRequestModel;
import com.department.department_management.cleanarchitecture.usecase.model.DepartmentResponseModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DepartmentController {
    final DepartmentInputBoundary departmentInputBoundary;

    public DepartmentController(DepartmentInputBoundary departmentInputBoundary) {
        this.departmentInputBoundary = departmentInputBoundary;
    }

    @PostMapping("/department")
    DepartmentResponseModel create(@RequestBody DepartmentRequestModel departmentRequestModel) {
        return departmentInputBoundary.create(departmentRequestModel);
    }
}
