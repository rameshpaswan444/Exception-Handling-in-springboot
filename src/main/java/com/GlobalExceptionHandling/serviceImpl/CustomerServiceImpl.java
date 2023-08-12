package com.GlobalExceptionHandling.serviceImpl;

import com.GlobalExceptionHandling.Exception.CustomerAlreadyExistsException;
import com.GlobalExceptionHandling.Exception.NoSuchCustomerExistsException;
import com.GlobalExceptionHandling.Repo.CustomerRepo;
import com.GlobalExceptionHandling.entity.Customer;
import com.GlobalExceptionHandling.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public String addCustomer(Customer customer) {
       Customer existingCustomer=customerRepo.findById(customer.getId()).orElse(null);
        if (existingCustomer == null){
            customerRepo.save(customer);
         return "Customer added Successfully";
       }
       else
            throw new CustomerAlreadyExistsException("Customer already exists !!");
       //return customerRepo.save(customer);
    }

    @Override
    public Customer getCustomerById(Long id) {
       return customerRepo.findById(id).orElseThrow(()->new NoSuchCustomerExistsException("No Customer Present with the id = "+id,"insert matchable id",404));

    }
}
