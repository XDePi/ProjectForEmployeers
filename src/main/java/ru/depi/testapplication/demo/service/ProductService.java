package ru.depi.testapplication.demo.service;

import ru.depi.testapplication.demo.dto.ProductDTO;
import ru.depi.testapplication.demo.entity.Product;

import java.util.List;
import java.util.Set;

public interface ProductService {

    ProductDTO addProduct(ProductDTO productDTO);

    public List<ProductDTO> getAllProducts();

    public ProductDTO updateProduct(int id, ProductDTO productDTO);

    public String deleteProduct(int id);

    List<ProductDTO> findAllByInfo(String info);

    List<ProductDTO> findAllByName(String name);
}
