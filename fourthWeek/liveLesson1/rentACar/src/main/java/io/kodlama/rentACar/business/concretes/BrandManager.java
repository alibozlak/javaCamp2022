package io.kodlama.rentACar.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import io.kodlama.rentACar.business.abstracts.BrandService;
import io.kodlama.rentACar.dataAccess.abstracts.BrandRepository;
import io.kodlama.rentACar.entities.concretes.Brand;

@Service    // <-- Bu sınıf bir business katmanı classıdır.
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        // Business kuralları

        return brandRepository.getAll();
    }
    
}
