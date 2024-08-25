package com.department.department_management.cleanarchitecture.adapter.repository;

import com.department.department_management.cleanarchitecture.adapter.gateway.DepartmentDataMapper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentDataMapper, String> {
}
