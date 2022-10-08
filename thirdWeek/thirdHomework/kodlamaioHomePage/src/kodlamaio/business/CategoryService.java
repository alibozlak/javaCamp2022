package kodlamaio.business;

import kodlamaio.entities.Category;

public interface CategoryService {
    void add(Category category) throws Exception;
    void delete(int categoryId);
}
