package com.GlobalExceptionHandling.Repo;

import com.GlobalExceptionHandling.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
