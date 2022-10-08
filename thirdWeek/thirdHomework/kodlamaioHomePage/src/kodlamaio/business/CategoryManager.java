package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CategoryDao;
import kodlamaio.entities.Category;

public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Category category) throws Exception {
        // Kategori ismi tekrar etmemeli :
        if (categoryDao.getByName(category.getName()) != null) {
            throw new Exception(category.getName() + " isimli category vardır!");
        } else {
            categoryDao.add(category);

            for (Logger logger : loggers) {
                logger.log(category.getName() + " isimli kategori eklendi");
            }
        }
    }

    @Override
    public void delete(int categoryId) {
        categoryDao.delete(categoryId);

        for (Logger logger : loggers) {
            logger.log(categoryId + " nolu id'ye sahip categori silindi");
        }
    }
    
}
