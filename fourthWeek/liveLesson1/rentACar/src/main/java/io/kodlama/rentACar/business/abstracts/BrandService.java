package io.kodlama.rentACar.business.abstracts;

import java.util.List;

import io.kodlama.rentACar.entities.concretes.Brand;

public interface BrandService {
    List<Brand> getAll();
}
