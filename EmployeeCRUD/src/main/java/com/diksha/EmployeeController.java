package com.diksha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        String employeeId = employeeService.addEmployee(employee);
        return ResponseEntity.ok(employeeId);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable String employeeId) {
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity<Void> updateEmployee(@PathVariable String employeeId, @RequestBody Employee updatedEmployee) {
        employeeService.updateEmployee(employeeId, updatedEmployee);
        return ResponseEntity.noContent().build();
    }

}
