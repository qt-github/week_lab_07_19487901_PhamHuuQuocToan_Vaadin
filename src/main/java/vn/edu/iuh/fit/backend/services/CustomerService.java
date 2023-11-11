package vn.edu.iuh.fit.backend.services;

import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;
import vn.edu.iuh.fit.backend.models.Customer;
import vn.edu.iuh.fit.backend.models.Employee;
import vn.edu.iuh.fit.backend.repositories.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements CrudListener<Customer> {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void save(Customer customer){
        customerRepository.save(customer);
    }

    public boolean delete(long id){
        try {
            customerRepository.deleteById(id);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    @Override
    public Customer add(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }

    public Optional<Customer> findById(long id){
        return customerRepository.findById(id);
    }
}
