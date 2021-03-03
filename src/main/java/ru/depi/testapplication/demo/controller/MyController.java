package ru.depi.testapplication.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.depi.testapplication.demo.entity.Product;
import ru.depi.testapplication.demo.exceptions.NoSuchProductException;
import ru.depi.testapplication.demo.service.ProductService;

import java.sql.Date;
import java.util.List;

/**
 * @author DePi
 **/

@RestController
public class MyController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id) {
        Product product = productService.getProduct(id);

        if (product == null)
            throw new NoSuchProductException();
        return product;
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return product;
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return product;
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id) {
        Product product = productService.getProduct(id);
        if (product == null)
            throw new NoSuchProductException();

        productService.deleteProduct(id);
    }
}
