package ru.depi.testapplication.demo.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @author DePi
 **/

@Entity
@Table(name = "info_language")
public class Info_language {

    @Id
    @Column
    private String language;

    @Transient
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "language",
            fetch = FetchType.EAGER)
    private List<Product> products;

    public Info_language() {
    }

    public Info_language(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Info_language{" +
                "language='" + language + '\'' +
                ", products=" + products +
                '}';
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<Product> getProducts() {
        return products;
    }

//    public void setProducts(List<Product> products) {
//        this.products = products;
//    }
}
