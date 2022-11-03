package io.kodlama.rentACar.business.abstracts;

import java.util.List;

import io.kodlama.rentACar.business.requests.CreateBrandRequest;
import io.kodlama.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
