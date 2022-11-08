package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.programmingLanguage.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.programmingLanguage.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;

public interface ProgrammingLanguageService {
    void add(CreateProgrammingLanguageRequest programmingLanguageRequest) throws Exception;
    void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception;
    void delete(int programmingLanguageId) throws Exception;
    List<GetAllProgrammingLanguagesResponse> getAll();
    GetAllProgrammingLanguagesResponse getById(int programmingLanguageId) throws Exception;
    boolean existsProgrammingLangageId(int programmingLanguageId);
}
