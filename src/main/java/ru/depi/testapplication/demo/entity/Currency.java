package ru.depi.testapplication.demo.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @author DePi
 **/

@Entity
@Table(name = "currency")
public class Currency {

    @Id
    @Column
    private String value;

    @OneToMany(cascade = {CascadeType.PERSIST,
            CascadeType.DETACH,
            CascadeType.REFRESH,
            CascadeType.MERGE},
            mappedBy = "currency",
            fetch = FetchType.EAGER)
    private List<Product> products;

    public Currency() {
    }

    @Override
    public String toString() {
        return "Currency{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
