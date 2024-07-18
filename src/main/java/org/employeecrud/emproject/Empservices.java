package org.employeecrud.emproject;

import java.util.List;

public interface Empservices {
    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id,Employee employee);
    

}
