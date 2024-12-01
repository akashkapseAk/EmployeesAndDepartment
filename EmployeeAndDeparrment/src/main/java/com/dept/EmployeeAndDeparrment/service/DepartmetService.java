package com.dept.EmployeeAndDeparrment.service;

import com.dept.EmployeeAndDeparrment.Model.Department;

import java.util.List;

public interface DepartmetService {


    public Department createDepartment(Department department);

    List<Department> getAllDepartments();

    public Department getDepartmentById(long deptId);


    public void deleteDepartmentById(long deptId);
}
