package ru.depi.testapplication.demo.dto;

import ru.depi.testapplication.demo.entity.Currency;
import ru.depi.testapplication.demo.entity.Info_language;

import java.util.Date;
import java.util.List;

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
    private List<String> currencies;
    private List<String> languages;

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

    public List<String> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
}
