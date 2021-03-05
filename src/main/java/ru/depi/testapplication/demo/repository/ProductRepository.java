package ru.depi.testapplication.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.depi.testapplication.demo.entity.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
