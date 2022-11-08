package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.business.abstracts.SubTechologyService;
import Kodlama.io.Devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnology.UpdateSubTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import Kodlama.io.Devs.business.responses.GetAllSubTechnologyResponse;
import Kodlama.io.Devs.dataAccess.abstracts.SubTechnologyRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.entities.concretes.SubTechnology;

@Service
public class SubTechnologyManager implements SubTechologyService {

    private SubTechnologyRepository subTechnologyRepository;
    private ProgrammingLanguageService programmingLanguageService;

    public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository,
            ProgrammingLanguageService programmingLanguageService) {
        this.subTechnologyRepository = subTechnologyRepository;
        this.programmingLanguageService = programmingLanguageService;
    }

    @Override
    public void add(CreateSubTechnologyRequest subTechnologyRequest) throws Exception {
        if (!isNameEmpty(subTechnologyRequest.getName()) && !isNameRepeat(subTechnologyRequest.getName()) && 
        isExistProgrammingLanguageId(subTechnologyRequest.getProgrammingLanguageId())) {
            SubTechnology subTechnology = new SubTechnology();
            subTechnology.setName(subTechnologyRequest.getName());

            GetAllProgrammingLanguagesResponse getAllProgrammingLanguagesResponse 
            = this.programmingLanguageService.getById(subTechnologyRequest.getProgrammingLanguageId());

            ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
            programmingLanguage.setId(getAllProgrammingLanguagesResponse.getId());
            programmingLanguage.setName(getAllProgrammingLanguagesResponse.getName());

            subTechnology.setProgrammingLanguage(programmingLanguage);

            this.subTechnologyRepository.save(subTechnology);
        }
    }

    @Override
    public void delete(int subTechnologyId) throws Exception {
        if (isExistSubTechnologyId(subTechnologyId)) {
            this.subTechnologyRepository.deleteById(subTechnologyId);
        }
    }

    @Override
    public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest) throws Exception {
        if (!isNameEmpty(updateSubTechnologyRequest.getSubTechnologyName()) && 
        !isNameRepeat(updateSubTechnologyRequest.getSubTechnologyName()) && 
        isExistSubTechnologyId(updateSubTechnologyRequest.getSubTechnologyId()) && 
        isExistProgrammingLanguageId(updateSubTechnologyRequest.getProgrammingLanguageId())) {
            SubTechnology subTechnology = new SubTechnology();
            subTechnology.setId(updateSubTechnologyRequest.getSubTechnologyId());
            subTechnology.setName(updateSubTechnologyRequest.getSubTechnologyName());
            
            GetAllProgrammingLanguagesResponse getAllProgrammingLanguagesResponse 
            = this.programmingLanguageService.getById(updateSubTechnologyRequest.getProgrammingLanguageId());

            ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
            programmingLanguage.setId(getAllProgrammingLanguagesResponse.getId());
            programmingLanguage.setName(getAllProgrammingLanguagesResponse.getName());

            subTechnology.setProgrammingLanguage(programmingLanguage);

            this.subTechnologyRepository.save(subTechnology);
        }
    }

    @Override
    public List<GetAllSubTechnologyResponse> getAll() {
        List<GetAllSubTechnologyResponse> getAllSubTechnologyResponses 
        = new ArrayList<>();
        for (SubTechnology subTechnology : this.subTechnologyRepository.findAll()) {
            GetAllSubTechnologyResponse getAllSubTechnologyResponse 
            = new GetAllSubTechnologyResponse();

            getAllSubTechnologyResponse.setId(subTechnology.getId());
            getAllSubTechnologyResponse.setName(subTechnology.getName());

            GetAllProgrammingLanguagesResponse getAllProgrammingLanguagesResponse 
            = new GetAllProgrammingLanguagesResponse();

            ProgrammingLanguage programmingLanguage = subTechnology.getProgrammingLanguage();
            getAllProgrammingLanguagesResponse.setId(programmingLanguage.getId());
            getAllProgrammingLanguagesResponse.setName(programmingLanguage.getName());

            getAllSubTechnologyResponse.setGetAllProgrammingLanguagesResponse(getAllProgrammingLanguagesResponse);

            getAllSubTechnologyResponses.add(getAllSubTechnologyResponse);
        }
        return getAllSubTechnologyResponses;
    }

    private boolean isNameEmpty(String subTechnologyName) throws Exception {
        if (subTechnologyName.isBlank() || subTechnologyName.isEmpty()) {
            throw new Exception("Alt Teknoloji ismi boş olamaz!");
        }
        return false;
    }

    private boolean isNameRepeat(String subTechnologyName) throws Exception {
        for (SubTechnology subTechnology : this.subTechnologyRepository.findAll()) {
            if (subTechnologyName.equalsIgnoreCase(subTechnology.getName())) {
                throw new Exception(subTechnologyName + " isminde bir alt teknoloji ismi var!");
            }
        }
        return false;
    }

    private boolean isExistProgrammingLanguageId(int programmingLanguageId) throws Exception {
        if (this.programmingLanguageService.existsProgrammingLangageId(programmingLanguageId)) {
            return true;
        }
        throw new Exception(programmingLanguageId + " IDli bir programlama dili yok!");
    }

    private boolean isExistSubTechnologyId(int subTechnologyId) throws Exception {
        if (this.subTechnologyRepository.existsById(subTechnologyId)) {
            return true;
        }
        throw new Exception(subTechnologyId + " IDli bir alt teknoloji yok!");
    }
    
}
