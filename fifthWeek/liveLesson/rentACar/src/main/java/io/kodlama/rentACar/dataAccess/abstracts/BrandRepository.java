package io.kodlama.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.kodlama.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
    
}
