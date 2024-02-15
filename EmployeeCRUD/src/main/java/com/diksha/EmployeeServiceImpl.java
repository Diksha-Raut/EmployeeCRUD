package com.diksha;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String addEmployee(Employee employee) {
        String employeeId = UUID.randomUUID().toString();
        employee.setId(employeeId);
        employeeRepository.save(employee);
        return employeeId;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployee(String employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public void updateEmployee(String employeeId, Employee updatedEmployee) {
        if (employeeRepository.existsById(employeeId)) {
            updatedEmployee.setId(employeeId);
            employeeRepository.save(updatedEmployee);
        }
    }

   

    
}
