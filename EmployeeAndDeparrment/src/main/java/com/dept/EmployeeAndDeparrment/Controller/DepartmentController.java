package com.dept.EmployeeAndDeparrment.Controller;

import com.dept.EmployeeAndDeparrment.Model.Department;
import com.dept.EmployeeAndDeparrment.service.DepartmetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DepartmentController {



    @Autowired
    private DepartmetService departmetService;


    @PostMapping("/")
    public ResponseEntity<Department> createDept(@RequestBody Department department)
    {
        Department department1 = this.departmetService.createDepartment(department);

        return new ResponseEntity<>(department1, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Department>> getAllDept()
    {
        List<Department> allDepartments = this.departmetService.getAllDepartments();

        return new ResponseEntity<>(allDepartments,HttpStatus.OK);
    }

    @GetMapping("/s/{deptId}")
    public ResponseEntity<Department> getDeptById(@PathVariable("deptId") long deptId)
    {
        Department departmentById = this.departmetService.getDepartmentById(deptId);

        return new ResponseEntity<>(departmentById,HttpStatus.OK);
    }

    @DeleteMapping("/d/{deptId}")
    public ResponseEntity<Department> deleteDept(@PathVariable Long deptId)
    {
        this.departmetService.deleteDepartmentById(deptId);

        return  ResponseEntity.noContent().build();
    }


}
