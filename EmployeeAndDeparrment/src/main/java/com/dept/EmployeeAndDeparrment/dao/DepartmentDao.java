package com.dept.EmployeeAndDeparrment.dao;

import com.dept.EmployeeAndDeparrment.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDao extends JpaRepository<Department,Long> {
}
