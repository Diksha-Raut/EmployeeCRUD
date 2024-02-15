package com.diksha;

import java.util.List;


public interface EmployeeService {
    
    String addEmployee(Employee employee);
    
    List<Employee> getAllEmployees();
    
    void deleteEmployee(String employeeId);
    
    void updateEmployee(String employeeId, Employee updatedEmployee);
    
    
}
