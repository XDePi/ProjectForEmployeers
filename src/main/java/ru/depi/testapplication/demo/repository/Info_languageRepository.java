package ru.depi.testapplication.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.depi.testapplication.demo.entity.Info_language;

@Repository
public interface Info_languageRepository extends JpaRepository<Info_language, Integer> {
    Info_language findByLanguage(String language);
}
