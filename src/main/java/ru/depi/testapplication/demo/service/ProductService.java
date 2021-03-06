package ru.depi.testapplication.demo.service;

import ru.depi.testapplication.demo.dto.ProductDTO;

import java.util.List;
import java.util.Set;

public interface ProductService {

    ProductDTO addProduct(ProductDTO productDTO);

    public List<ProductDTO> getAllProducts();

    public ProductDTO updateProduct(int id, ProductDTO productDTO);

    public String deleteProduct(int id);
}
