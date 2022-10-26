package io.kodlama.rentACar.dataAccess.abstracts;

import java.util.List;

import io.kodlama.rentACar.entities.concretes.Brand;

public interface BrandRepository {
    List<Brand> getAll();
}
