package ru.depi.testapplication.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.depi.testapplication.demo.dao.CurrencyDAO;
import ru.depi.testapplication.demo.entity.Currency;

import java.util.List;

/**
 * @author DePi
 **/
@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    CurrencyDAO currencyDAO;

    @Override
    @Transactional
    public List<Currency> getAllCurrencies() {
        return currencyDAO.getAllCurrencies();
    }
}
