package com.dept.EmployeeAndDeparrment.serviceImpl;

import com.dept.EmployeeAndDeparrment.Model.Department;
import com.dept.EmployeeAndDeparrment.dao.DepartmentDao;
import com.dept.EmployeeAndDeparrment.service.DepartmetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentImpl implements DepartmetService {


    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public Department createDepartment(Department department) {

        Department department1 = this.departmentDao.save(department);
        return department1;
    }

    @Override
    public List<Department> getAllDepartments() {

        List<Department> all = this.departmentDao.findAll();


        return all;
    }

    @Override
    public Department getDepartmentById(long deptId) {


        Department departmentNotFound = this.departmentDao.findById(deptId).orElseThrow(() -> new RuntimeException("department not found"));
        return departmentNotFound;
    }

    @Override
    public void deleteDepartmentById(long deptId) {

        this.departmentDao.deleteById(deptId);

    }
}
