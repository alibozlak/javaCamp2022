package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    private List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository(){
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1, "C"));
        programmingLanguages.add(new ProgrammingLanguage(2, "Java"));
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage programmingLang = this.findProgrammingLanguage(programmingLanguage.getId());
        programmingLang.setName(programmingLanguage.getName());
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage programmingLang = this.findProgrammingLanguage(programmingLanguage.getId());
        programmingLanguages.remove(programmingLang);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return this.programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return this.findProgrammingLanguage(id);
    }

    private ProgrammingLanguage findProgrammingLanguage(int id) {
        ProgrammingLanguage programmingLang = null;
        for (ProgrammingLanguage _programmingLanguage : programmingLanguages) {
            if (_programmingLanguage.getId() == id) {
                programmingLang = _programmingLanguage;
                break;
            }
        }
        return programmingLang;
    }
    
}
