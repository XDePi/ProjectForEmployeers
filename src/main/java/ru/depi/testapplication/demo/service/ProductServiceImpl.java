package ru.depi.testapplication.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.depi.testapplication.demo.dao.ProductDAO;
import ru.depi.testapplication.demo.entity.Product;

import java.util.List;

/**
 * @author DePi
 **/

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDAO productDAO;

    @Override
    @Transactional
    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    @Override
    @Transactional
    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

    @Override
    @Transactional
    public void deleteProduct(int id) {
        productDAO.deleteProduct(id);
    }

    @Override
    @Transactional
    public Product getProduct(int id) {
        Product product = productDAO.getProduct(id);
        return product;
    }
}
