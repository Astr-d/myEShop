package com.example.myeshop.repositories;

import com.example.myeshop.entities.Customer;
import com.example.myeshop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
