package ru.depi.testapplication.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.depi.testapplication.demo.entity.Currency;
import ru.depi.testapplication.demo.repository.CurrencyRepository;

/**
 * @author DePi
 **/

@RestController
public class CurrencyController {

//    @Autowired
//    CurrencyRepository currencyRepository;
//
//    @PostMapping("/currencies")
//    public Currency addNewCurrency(@RequestBody Currency currency) {
//        return currencyRepository.save(currency);
//    }
}
