package ru.depi.testapplication.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.depi.testapplication.demo.entity.Info_language;
import ru.depi.testapplication.demo.repository.Info_languageRepository;

/**
 * @author DePi
 **/

@RestController
public class LanguageController {

//    @Autowired
//    Info_languageRepository languageRepository;
//
//    @PostMapping("/languages")
//    public Info_language addNewLanguage(@RequestBody Info_language language) {
//        return languageRepository.save(language);
//    }
}
