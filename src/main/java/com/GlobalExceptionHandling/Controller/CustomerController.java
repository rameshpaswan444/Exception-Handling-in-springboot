package com.GlobalExceptionHandling.Controller;

import com.GlobalExceptionHandling.entity.Customer;
import com.GlobalExceptionHandling.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/add")
    public String addCustomer(@RequestBody Customer customer){
      String customer1= customerService.addCustomer(customer);
       return customer1;
    }
    @GetMapping("/get/{id}")
    public Customer getCustomerById(@PathVariable("id") Long id){
        return customerService.getCustomerById(id);
    }
}
