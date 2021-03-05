package ru.depi.testapplication.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
            joinColumns = @JoinColumn(name = "languageId"),
            inverseJoinColumns = @JoinColumn(name = "productId")
    )
    private List<Product> products;

    public void addProductsToLanguage(Product product) {
        if (products == null)
            products = new ArrayList<>();
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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
