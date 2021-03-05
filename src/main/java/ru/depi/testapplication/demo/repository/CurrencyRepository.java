package ru.depi.testapplication.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.depi.testapplication.demo.entity.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
    Currency findByValue(String value);
}
