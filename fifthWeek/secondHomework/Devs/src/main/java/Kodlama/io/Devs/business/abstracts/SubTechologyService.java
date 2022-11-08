package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnology.UpdateSubTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllSubTechnologyResponse;

public interface SubTechologyService {
    void add(CreateSubTechnologyRequest createSubTechnologyRequest) throws Exception;
    void delete(int subTechnologyId) throws Exception;
    void update(UpdateSubTechnologyRequest updateSubTechnologyRequest) throws Exception;
    List<GetAllSubTechnologyResponse> getAll();
}
