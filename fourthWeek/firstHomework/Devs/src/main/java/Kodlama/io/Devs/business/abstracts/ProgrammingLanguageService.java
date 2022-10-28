package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
    void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void update(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(ProgrammingLanguage programmingLanguage);
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
}
