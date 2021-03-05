package ru.depi.testapplication.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.depi.testapplication.demo.entity.Currency;
import ru.depi.testapplication.demo.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * @author DePi
 **/

@Repository
public class CurrencyDAOImpl implements CurrencyDAO{
    @Autowired
    EntityManager entityManager;

    @Override
    public List<Currency> getAllCurrencies() {
        Query query = entityManager.createQuery("from Currency");
        List<Currency> currencies = query.getResultList();
        return currencies;
    }

}
