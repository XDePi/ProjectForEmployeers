package ru.depi.testapplication.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.depi.testapplication.demo.entity.Currency;
import ru.depi.testapplication.demo.entity.Info_language;
import ru.depi.testapplication.demo.entity.Product;

import java.io.Serializable;

@Repository
public interface Info_languageRepository extends JpaRepository<Info_language, Integer> {
}
