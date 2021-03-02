package ru.depi.testapplication.demo.service;

import ru.depi.testapplication.demo.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    void addProduct(Product product);
    public void deleteProduct(int id);
}
