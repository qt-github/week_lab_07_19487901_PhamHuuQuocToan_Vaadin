package vn.edu.iuh.fit.backend.services;

import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;
import vn.edu.iuh.fit.backend.models.Employee;
import vn.edu.iuh.fit.backend.repositories.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements CrudListener<Employee> {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    public boolean delete(long id){
        try {
            employeeRepository.deleteById(id);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public List<Employee> findAll(){
       return employeeRepository.findAll();
    }

    @Override
    public Employee add(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    public Optional<Employee> findById(long id){
        return employeeRepository.findById(id);
    }
}
