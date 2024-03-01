package com.example.Kodlama.io.Devs.business.concretes;

import com.example.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.example.Kodlama.io.Devs.entities.ProgrammingLanguage;
import com.example.Kodlama.io.Devs.repositories.abstracts.ProgrammingLanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImp implements LanguageService {

    private ProgrammingLanguageRepository pLRepository;

    public LanguageServiceImp(ProgrammingLanguageRepository pLRepository) {
        this.pLRepository = pLRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return pLRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getByID(int id) {
        return pLRepository.getById(id);
    }

    @Override
    public void add(ProgrammingLanguage language) {
        if (getAll().contains(language)) {
            throw new IllegalArgumentException("Bu programlama dili sistemde kayıtlı. Aynı isimde programlama dili ekleyemezsiniz.");
        }
        if (language.getName().isEmpty()) {
            throw new IllegalArgumentException("Programlama dili boş bırakılamaz.");
        }
        pLRepository.add(language);
    }

    @Override
    public void update(int id, ProgrammingLanguage language, String newProgrammingName) {
        if (getAll().contains(language)) {
            throw new IllegalArgumentException("Bu programlama dili sistemde kayıtlı. Aynı isimde programlama dili ekleyemezsiniz.");
        }
        if (language.getName().isEmpty()) {
            throw new IllegalArgumentException("Programlama dili boş bırakılamaz.");
        }
        pLRepository.update(newProgrammingName, id);
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        pLRepository.delete(programmingLanguage);
    }
}
