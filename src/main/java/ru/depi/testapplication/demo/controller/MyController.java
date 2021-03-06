package ru.depi.testapplication.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.depi.testapplication.demo.entity.Product;
import ru.depi.testapplication.demo.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DePi
 **/

@RestController
public class MyController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/products")
    public Product addNewProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().iterator().forEachRemaining(products::add);
        return products;
    }

}
