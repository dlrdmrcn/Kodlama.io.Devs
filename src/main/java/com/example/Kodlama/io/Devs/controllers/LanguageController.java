package com.example.Kodlama.io.Devs.controllers;

import com.example.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.example.Kodlama.io.Devs.entities.ProgrammingLanguage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
    private LanguageService languageService;


    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping
    public List<ProgrammingLanguage> getAll() {
        return languageService.getAll();
    }

    @GetMapping("/{id}")
    public ProgrammingLanguage getByID(@PathVariable int id) {
        return languageService.getByID(id);
    }

    @PostMapping
    public void add(@RequestBody ProgrammingLanguage language) {
        languageService.add(language);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, ProgrammingLanguage language, @RequestBody String programmingName) {
        languageService.update(id, language, programmingName);
    }

    @DeleteMapping("/{language}")
    public void delete(@PathVariable ProgrammingLanguage language) {
        languageService.delete(language);
    }
}
