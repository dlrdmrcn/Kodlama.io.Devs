package com.example.Kodlama.io.Devs.business.abstracts;

import com.example.Kodlama.io.Devs.entities.ProgrammingLanguage;

import java.util.List;

public interface LanguageService {
    List<ProgrammingLanguage> getAll();

    ProgrammingLanguage getByID(int id);

    void add(ProgrammingLanguage language);

    void update(int id, ProgrammingLanguage language, String newProgrammingName);

    void delete(ProgrammingLanguage programmingLanguage);
}
