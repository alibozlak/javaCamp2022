package kodlamaio.dataAccess.jdbc;

import kodlamaio.DB;
import kodlamaio.dataAccess.CategoryDao;
import kodlamaio.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

    @Override
    public void add(Category category) {
        DB.categories.add(category);
        System.out.println(category.getName() + " kategorisi JDBC ile veritabanına eklendi");
    }

    @Override
    public void delete(int id) {
        // Aslında streamlerle (lambda) daha kolay ama görmedik :
        int lengthOfCategories = DB.categories.size();

        for (int i = 0; i < lengthOfCategories; i++) {
            if (DB.categories.get(i).getId() == id) {
                System.out.println(DB.categories.get(i).getName() + " kategorisi JDBC ile veritabanından silindi");
                DB.categories.remove(i);
                break;
            }
        }
    }

    @Override
    public Category getByName(String categoryName) {
        int lengthOfCategories = DB.categories.size();

        for (int i = 0; i < lengthOfCategories; i++) {
            if (categoryName.equals(DB.categories.get(i).getName())) {
                return DB.categories.get(i);
            }
        }

        return null;
    }
    
}
