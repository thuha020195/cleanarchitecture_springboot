package com.department.department_management.cleanarchitecture.adapter.gateway;

import com.department.department_management.cleanarchitecture.adapter.repository.DepartmentRepository;
import com.department.department_management.cleanarchitecture.usecase.boundary.DepartmentDsGateway;
import com.department.department_management.cleanarchitecture.usecase.model.DepartmentDsRequestModel;

public class JpaDepartment implements DepartmentDsGateway {
    final DepartmentRepository departmentRepository;

    public JpaDepartment(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public boolean existsByName(String name) {
        return departmentRepository.existsById(name);
    }

    @Override
    public void save(DepartmentDsRequestModel departmentDsRequestModel) {
        DepartmentDataMapper departmentDataMapper = new DepartmentDataMapper(departmentDsRequestModel.getName(), departmentDsRequestModel.getCreationTime());
        departmentRepository.save(departmentDataMapper);
    }
}
