package com.dept.EmployeeAndDeparrment.serviceImpl;

import com.dept.EmployeeAndDeparrment.Model.Employees;
import com.dept.EmployeeAndDeparrment.dao.EmployeesDao;
import com.dept.EmployeeAndDeparrment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService {

    @Autowired
    private EmployeesDao employeesDao;


    @Override
    public Employees createEmp(Employees employees) {

        Employees employees1 = this.employeesDao.save(employees);
        return employees1;
    }

    @Override
    public List<Employees> getAllEMp() {

        List<Employees> employeesDaoAll = this.employeesDao.findAll();
        return employeesDaoAll;
    }

    @Override
    public List<Employees> getEmployeesByDepartment(Long deptId) {

        List<Employees> departmentId = this.employeesDao.findEmployeesByDepartmentId(deptId);
        return departmentId;
    }

    @Override
    public void deleteEmployee(Long empId) {

        this.employeesDao.deleteById(empId);
    }
}
