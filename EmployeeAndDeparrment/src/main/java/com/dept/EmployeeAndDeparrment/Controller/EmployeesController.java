package com.dept.EmployeeAndDeparrment.Controller;

import com.dept.EmployeeAndDeparrment.Model.Employees;
import com.dept.EmployeeAndDeparrment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeesController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/")
    public ResponseEntity<Employees> createEmp(@RequestBody Employees employees)
    {
        Employees emp = this.employeeService.createEmp(employees);

        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employees>> getAllEMp()
    {
        List<Employees> allEMp = this.employeeService.getAllEMp();

        return new ResponseEntity<>(allEMp,HttpStatus.OK);
    }


    @GetMapping("/dept/{deptId}")
    public ResponseEntity<List<Employees>> getEmployeesByDepartment(@PathVariable Long deptId)
    {
        List<Employees> employeesByDepartment = this.employeeService.getEmployeesByDepartment(deptId);

        return new ResponseEntity<>(employeesByDepartment,HttpStatus.OK);
    }

    @DeleteMapping("/d/{empId}")
    public ResponseEntity<Employees> deleteEmp(@PathVariable long empId)
    {
        this.employeeService.deleteEmployee(empId);

        return ResponseEntity.noContent().build();
    }
}
