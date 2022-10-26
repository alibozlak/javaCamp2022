package io.kodlama.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.kodlama.rentACar.business.abstracts.BrandService;
import io.kodlama.rentACar.entities.concretes.Brand;

@RestController     // <--- Annotation (Bilgilendirme)
@RequestMapping("/api/brands")
public class BrandsController {
    
    private BrandService brandService;

    // @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<Brand> getAll() {
        return this.brandService.getAll();
    }
    
}
