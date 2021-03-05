package ru.depi.testapplication.demo.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "language")
    private Info_language language;

    @Column
    @Min(value = 1, message = "Price must be not less than 1")
    private double price;

    @ManyToOne(cascade = CascadeType.ALL/*{CascadeType.PERSIST,
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.REFRESH}*/)
    @JoinColumn(name = "currency")
    private Currency currency;

    @Column(updatable = false)
    @CreationTimestamp
    private Date date;

    @Column
    @UpdateTimestamp
    private Date date_of_modification;

    public Product() {
    }

    public Product(String name, String info, Info_language language, double price,
                   Currency currency, Date date, Date date_of_modification) {
        this.name = name;
        this.info = info;
        this.language = language;
        this.price = price;
        this.currency = currency;
        this.date = date;
        this.date_of_modification = date_of_modification;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", language=" + language +
                ", price=" + price +
                ", currency=" + currency +
                ", date=" + date +
                ", date_of_modification=" + date_of_modification +
                '}';
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
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

    public Info_language getLanguage() {
        return language;
    }

    public void setLanguage(Info_language language) {
        this.language = language;
    }
}
