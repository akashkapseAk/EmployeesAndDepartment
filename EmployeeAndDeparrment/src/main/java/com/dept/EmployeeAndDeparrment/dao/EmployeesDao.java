package com.dept.EmployeeAndDeparrment.dao;

import com.dept.EmployeeAndDeparrment.Model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeesDao extends JpaRepository<Employees,Long> {


    @Query("SELECT e FROM Employees e WHERE e.deptId= :deptId")
    List<Employees> findEmployeesByDepartmentId(long deptId);
}
