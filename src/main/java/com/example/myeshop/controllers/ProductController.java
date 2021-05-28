package com.example.myeshop.controllers;

import com.example.myeshop.entities.Product;
import com.example.myeshop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    /*@GetMapping("/")
    public String viewHomePage() {
        return "products";
    }*/

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Product> products = productRepository.findAll(); //findAll() standard method from spring
        model.addAttribute("products", products);
        return "index";
    }

}
