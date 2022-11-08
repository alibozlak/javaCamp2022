package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.SubTechologyService;
import Kodlama.io.Devs.business.requests.subTechnology.CreateSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnology.UpdateSubTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllSubTechnologyResponse;

@RestController
@RequestMapping("/api/subtechnologies")
public class SubTechnologiesController {

    private SubTechologyService subTechologyService;

    public SubTechnologiesController(SubTechologyService subTechologyService) {
        this.subTechologyService = subTechologyService;
    }

    @PostMapping
    public void add(@RequestBody CreateSubTechnologyRequest subTechnologyRequest) throws Exception {
        this.subTechologyService.add(subTechnologyRequest);
    }

    @DeleteMapping("/delete/{subTechnologyId}")
    public void delete(@PathVariable int subTechnologyId) throws Exception {
        this.subTechologyService.delete(subTechnologyId);
    }

    @PutMapping
    public void update(@RequestBody UpdateSubTechnologyRequest updateSubTechnologyRequest) throws Exception {
        this.subTechologyService.update(updateSubTechnologyRequest);
    }

    @GetMapping("/getall")
    public List<GetAllSubTechnologyResponse> getAll() {
        return this.subTechologyService.getAll();
    }

}
