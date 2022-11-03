package io.kodlama.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import io.kodlama.rentACar.business.abstracts.BrandService;
import io.kodlama.rentACar.business.requests.CreateBrandRequest;
import io.kodlama.rentACar.business.responses.GetAllBrandsResponse;
import io.kodlama.rentACar.dataAccess.abstracts.BrandRepository;
import io.kodlama.rentACar.entities.concretes.Brand;

@Service    // <-- Bu sınıf bir business katmanı classıdır.
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        // Business kuralları

        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses = new ArrayList<>();
        for (Brand brand : brands) {
            GetAllBrandsResponse brandsResponse = new GetAllBrandsResponse();
            brandsResponse.setId(brand.getId());
            brandsResponse.setName(brand.getName());

            brandsResponses.add(brandsResponse);
        }
        return brandsResponses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        this.brandRepository.save(brand);
    }
    
}
