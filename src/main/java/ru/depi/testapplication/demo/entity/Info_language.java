package ru.depi.testapplication.demo.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @author DePi
 **/

@Entity
@Table(name = "info_language")
public class Info_language {

    @Id
    @Column
    private String language;

    public Info_language() {
    }

    @Override
    public String toString() {
        return "Info_language{" +
                "language='" + language + '\'' +
                '}';
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
