package ru.depi.testapplication.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author DePi
 **/

@Entity
@Table(name = "info_language")
public class Info_language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String language;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "product_language",
            joinColumns = @JoinColumn(name = "language_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<Product> products;

    public void addProductsToLanguage(Product product) {
        if (products == null)
            products = new HashSet<>();
        products.add(product);
    }

    public Info_language() {
    }

    public Info_language(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Info_language{" +
                "id=" + id +
                ", language='" + language + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
