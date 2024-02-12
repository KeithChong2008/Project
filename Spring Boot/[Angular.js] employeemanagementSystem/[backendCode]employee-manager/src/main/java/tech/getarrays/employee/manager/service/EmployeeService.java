package tech.getarrays.employee.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employee.manager.Exception.UserNotFoundException;
import tech.getarrays.employee.manager.Repo.EmployeeRepo;
import tech.getarrays.employee.manager.model.Employee;
import java.util.*;

@Service
public class EmployeeService {
  private final EmployeeRepo employeeRepo;

  @Autowired
  public EmployeeService(EmployeeRepo employeeRepo) {
      this.employeeRepo = employeeRepo;
  }

  public Employee addEmployee(Employee employee) {
      employee.setEmployeeCode(UUID.randomUUID().toString());
      return employeeRepo.save(employee);
  }

  public List<Employee> findAllEmployees() {
      return employeeRepo.findAll();
  }

  public Employee updateEmployee(Employee employee) {
      return employeeRepo.save(employee);
  }

  public Employee findEmployeeById(Long id) {
      return employeeRepo.findEmployeeById(id)
              .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
  }

  public void deleteEmployee(Long id){
      employeeRepo.deleteEmployeeById(id);
  }
}
