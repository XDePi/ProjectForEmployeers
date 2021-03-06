package ru.depi.testapplication.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.*;

/**
 * @author DePi
 **/

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Column
    private String info;

    @Column
    @Min(value = 1, message = "Price must be not less than 1")
    private double price;

    @Column(updatable = false)
    @CreationTimestamp
    private Date date;

    @Column
    @UpdateTimestamp
    private Date date_of_modification;

    @ManyToMany(cascade = CascadeType.ALL,
                fetch = FetchType.LAZY)
    @JoinTable(
            name = "product_currencies",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "currency_id")
    )
    @JsonIgnoreProperties("products")
    private Set<Currency> currencies;

    @ManyToMany(cascade = CascadeType.ALL,
                fetch = FetchType.LAZY)
    @JoinTable(
            name = "product_language",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id")
    )
    @JsonIgnoreProperties("products")
    private Set<Info_language> languages = new HashSet<>();

    public Product() {
    }

    public Product(String name, String info, Info_language language, double price,
                   Currency currency, Date date, Date date_of_modification) {
        this.name = name;
        this.info = info;
        this.price = price;
        this.date = date;
        this.date_of_modification = date_of_modification;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", price=" + price +
                ", date=" + date +
                ", date_of_modification=" + date_of_modification +
                '}';
    }

    public Set<Info_language> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<Info_language> languages) {
        this.languages = languages;
    }

    public Set<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Set<Currency> currencies) {
        this.currencies = currencies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate_of_modification() {
        return date_of_modification;
    }

    public void setDate_of_modification(Date date_of_modification) {
        this.date_of_modification = date_of_modification;
    }

}
