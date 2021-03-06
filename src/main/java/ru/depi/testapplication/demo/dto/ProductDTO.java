package ru.depi.testapplication.demo.dto;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author DePi
 **/

public class ProductDTO {
    private int id;
    private String name;
    private String info;
    private double price;
    private Date date;
    private Date date_of_modification;
    private Set<String> currencies;
    private Set<String> languages;

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

    public Set<String> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Set<String> currencies) {
        this.currencies = currencies;
    }

    public Set<String> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<String> languages) {
        this.languages = languages;
    }
}
