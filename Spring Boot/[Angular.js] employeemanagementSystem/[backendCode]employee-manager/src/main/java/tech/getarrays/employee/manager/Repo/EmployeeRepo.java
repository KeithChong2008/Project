package tech.getarrays.employee.manager.Repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employee.manager.model.Employee;

public interface EmployeeRepo extends JpaRepository <Employee, Long> {

  void deleteEmployeeById(Long id);

  Optional<Employee> findEmployeeById(Long id);


  
} 

