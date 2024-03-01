package com.example.Kodlama.io.Devs.repositories.concretes;

import com.example.Kodlama.io.Devs.entities.ProgrammingLanguage;
import com.example.Kodlama.io.Devs.repositories.abstracts.ProgrammingLanguageRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProgrammingLanguageRepositoryImp implements ProgrammingLanguageRepository {
    private List<ProgrammingLanguage> pLanguageList;

    public ProgrammingLanguageRepositoryImp() {

        this.pLanguageList = new ArrayList<>();
        pLanguageList.add(new ProgrammingLanguage(1, "C#"));
        pLanguageList.add(new ProgrammingLanguage(2, "Java"));
        pLanguageList.add(new ProgrammingLanguage(3, "Python"));
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        pLanguageList.add(programmingLanguage);

    }

    @Override
    public void update(String languageName, int id) {
        this.getById(id).setName(languageName);

    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        pLanguageList.remove(programmingLanguage);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return pLanguageList;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage programmingLanguage : pLanguageList)
            if (programmingLanguage.getId() == id) {
                return programmingLanguage;
            }
        return null;
    }
}
