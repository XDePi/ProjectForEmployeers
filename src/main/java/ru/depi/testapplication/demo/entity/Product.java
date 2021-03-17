package ru.depi.testapplication.demo.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
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
    @Positive(message = "Price must be greater than 0")
    private double price;

    @Column(updatable = false,
            insertable = false)
    @CreationTimestamp
    private Date date;

    @Column(insertable = false)
    @UpdateTimestamp
    private Date date_of_modification;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "product_currencies",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "currency_id")
    )
    private Set<Currency> currencies;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "product_language",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id")
    )
    private Set<Info_language> languages;

    public void addCurrencyToProduct(Currency currency) {
        this.currencies.add(currency);
        currency.getProducts().add(this);
    }

    public void addLanguageToProduct(Info_language language) {
        this.languages.add(language);
        language.getProducts().add(this);
    }

    public void removeCurrency(Currency currency) {
        this.getCurrencies().remove(currency);
        currency.getProducts().remove(this);
    }

    public void removeLanguage(Info_language language) {
        this.getLanguages().remove(language);
        language.getProducts().remove(this);
    }

    public void removeCurrencies() {
        for (Currency currency : new HashSet<>(currencies)) {
            removeCurrency(currency);
        }
    }

    public void removeLanguages() {
        for (Info_language language : new HashSet<>(languages)) {
            removeLanguage(language);
        }
    }

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
