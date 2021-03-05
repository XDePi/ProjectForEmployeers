package ru.depi.testapplication.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DePi
 **/

@Entity
@Table(name = "currency")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String value;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "product_currencies",
            joinColumns = @JoinColumn(name = "currencyId"),
            inverseJoinColumns = @JoinColumn(name = "productId")
    )
    private List<Product> products;

    public void addProductsToCurrency(Product product) {
        if (products == null)
            products = new ArrayList<>();
        products.add(product);
    }

    public Currency() {
    }

    public Currency(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", value='" + value + '\'' +
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
