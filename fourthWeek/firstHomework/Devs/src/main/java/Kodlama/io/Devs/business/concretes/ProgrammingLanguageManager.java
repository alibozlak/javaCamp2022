package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        if (this.isValid(programmingLanguage)) {
            this.programmingLanguageRepository.add(programmingLanguage);
        }
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) throws Exception {
       if (this.isValid(programmingLanguage)) {
            this.programmingLanguageRepository.update(programmingLanguage);
       }
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguageRepository.delete(programmingLanguage);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return this.programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return this.programmingLanguageRepository.getById(id);
    }

    private boolean isNameEmpty(ProgrammingLanguage programmingLanguage) {
        if (programmingLanguage.getName().isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean isNameRepeat(ProgrammingLanguage programmingLanguage) {
        List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.getAll();
        for (ProgrammingLanguage _programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getName().equalsIgnoreCase(_programmingLanguage.getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean isValid(ProgrammingLanguage programmingLanguage) throws Exception {
        if (isNameEmpty(programmingLanguage)) {
            throw new Exception("Programlama Dili ismi boş olamaz!");
        }
        if (isNameRepeat(programmingLanguage)) {
            throw new Exception(programmingLanguage.getName() + " isminde bir programlama dili var!");
        }
        return true;
    }
    
}
