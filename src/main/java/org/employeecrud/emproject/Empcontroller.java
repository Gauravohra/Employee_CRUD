package org.employeecrud.emproject;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class Empcontroller {
    @Autowired
    private Empservices employeeservice;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeservice.readEmployees();
    }

    @PostMapping(value = "/employees", consumes = {"application/json"})
    public String createEmployee(@RequestBody Employee employee) {
        return employeeservice.createEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        if (employeeservice.deleteEmployee(id)) {
            return "Deleted Successfully";
        } else {
            return "Not Found";
        }
    }
    @PutMapping("/employees/{id}")
    public String putMethodName(@PathVariable Long id, @RequestBody Employee employee) {
        //TODO: process PUT request
        
        return employeeservice.updateEmployee(id, employee);
    }
}
