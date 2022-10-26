package io.kodlama.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import io.kodlama.rentACar.dataAccess.abstracts.BrandRepository;
import io.kodlama.rentACar.entities.concretes.Brand;

@Repository     // <-- Bu sınıf bir dataAccess katmanı classıdır.
public class InMemoryBrandRepository implements BrandRepository {

    ArrayList<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<>();
        brands.add(new Brand(1, "Audi"));
        brands.add(new Brand(2, "BMW"));
        brands.add(new Brand(3, "Mercedes"));
        brands.add(new Brand(4, "Fiat"));
        brands.add(new Brand(5, "Toyota"));
    }

    @Override
    public List<Brand> getAll() {
        return this.brands;
    }
    
}
