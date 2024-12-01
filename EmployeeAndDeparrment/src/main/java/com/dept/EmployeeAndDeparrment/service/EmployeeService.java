package com.dept.EmployeeAndDeparrment.service;

import com.dept.EmployeeAndDeparrment.Model.Employees;

import java.util.List;

public interface EmployeeService {


    Employees createEmp(Employees employees);

    public List<Employees> getAllEMp();

    public List<Employees> getEmployeesByDepartment(Long deptId);

    void deleteEmployee(Long empId);
}
