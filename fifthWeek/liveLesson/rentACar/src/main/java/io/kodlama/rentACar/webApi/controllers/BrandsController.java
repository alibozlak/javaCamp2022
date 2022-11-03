package io.kodlama.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.kodlama.rentACar.business.abstracts.BrandService;
import io.kodlama.rentACar.business.requests.CreateBrandRequest;
import io.kodlama.rentACar.business.responses.GetAllBrandsResponse;

@RestController     // <--- Annotation (Bilgilendirme)
@RequestMapping("/api/brands")
public class BrandsController {
    
    private BrandService brandService;

    // @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll() {
        return this.brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateBrandRequest createBrandRequest) {
        this.brandService.add(createBrandRequest);
    }
    
}
