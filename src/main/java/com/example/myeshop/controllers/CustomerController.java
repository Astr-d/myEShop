package com.example.myeshop.controllers;

import com.example.myeshop.entities.Customer;
import com.example.myeshop.repositories.CustomerRepository;
import com.example.myeshop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customer")
    public String viewCustomerPage(){
        return "customers";
    }

    @GetMapping("/new-customer")
    public String showNewCustomerPage(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "new-customer";
    }

    @PostMapping(value = "/save")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerRepository.save(customer);
        System.out.println("in save customer");
        return "redirect:/";
    }
}

