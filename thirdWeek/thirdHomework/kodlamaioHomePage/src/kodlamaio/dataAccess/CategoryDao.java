package kodlamaio.dataAccess;

import kodlamaio.entities.Category;

public interface CategoryDao {
    void add(Category category);
    void delete(int id);

    // Kategori isminin veritabanında unique olmasını istiyoruz.
    // Bundan dolayı returnü List<Category> yerine Category yaptım.
    Category getByName(String categoryName);
}
