package ru.depi.testapplication.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.depi.testapplication.demo.dto.ProductDTO;
import ru.depi.testapplication.demo.entity.Product;
import ru.depi.testapplication.demo.repository.ProductRepository;
import ru.depi.testapplication.demo.service.ProductService;

import java.util.List;

/**
 * @author DePi
 **/

@RestController
public class MyController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<ProductDTO> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/products/info/{info}")
    public ResponseEntity<List<ProductDTO>> findAllByInfo(@PathVariable String info) {
        List<ProductDTO> products = productService.findAllByInfo(info);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/products/name/{name}")
    public ResponseEntity<List<ProductDTO>> findAllByName(@PathVariable String name) {
        List<ProductDTO> products = productService.findAllByName(name);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO productDTO) {
        ProductDTO prd = productService.addProduct(productDTO);
        return new ResponseEntity<>(prd, HttpStatus.CREATED);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<ProductDTO> updateProduct(@PathVariable(name = "id") int id, @RequestBody ProductDTO productDTO) {
        ProductDTO prd = productService.updateProduct(id, productDTO);
        return new ResponseEntity<>(prd, HttpStatus.OK);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable(name = "id") int id) {
        String message = productService.deleteProduct(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
