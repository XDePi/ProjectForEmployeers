package ru.depi.testapplication.demo.dao;

import ru.depi.testapplication.demo.entity.Product;

import java.util.List;

public interface ProductDAO {

    List<Product> getAllProducts();
    void addProduct(Product product);
    void deleteProduct(int id);
    Product getProduct(int id);
}
