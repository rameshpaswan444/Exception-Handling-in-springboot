package com.GlobalExceptionHandling.service;

import com.GlobalExceptionHandling.entity.Customer;

public interface CustomerService {

    String addCustomer(Customer customer);
     Customer getCustomerById(Long id);
}
