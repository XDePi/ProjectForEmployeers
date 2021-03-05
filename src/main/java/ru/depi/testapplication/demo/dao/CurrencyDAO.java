package ru.depi.testapplication.demo.dao;

import ru.depi.testapplication.demo.entity.Currency;

import java.util.List;

public interface CurrencyDAO {
    List<Currency> getAllCurrencies();
}
