package com.example.Kodlama.io.Devs.repositories.abstracts;

import com.example.Kodlama.io.Devs.entities.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    void add(ProgrammingLanguage programmingLanguage);

    void update(String languageName, int id);

    void delete(ProgrammingLanguage programmingLanguage);

    List<ProgrammingLanguage> getAll();

    ProgrammingLanguage getById(int id);
}
