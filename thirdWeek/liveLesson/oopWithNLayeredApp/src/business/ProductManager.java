package business;

import core.logging.Logger;
// import dataAccess.HibernateProductDao;
// import dataAccess.JdbcProductDao;
import dataAccess.ProductDao;
import entities.Product;

public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;
    
    // Constructor Dependency Injection :
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        // Business rules here
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10'dan küçük olmaz!");
        }

        // JdbcProductDao productDao = new JdbcProductDao();   // <--- Bu JdbcProductDao'ya bağımlılık oluşturur.
        // ProductDao productDao = new HibernateProductDao();  // <--- Bunun yerine Dependency Injection kullanılacak.
        productDao.add(product);

        for (Logger logger : loggers) {
            logger.log(product.getName());
        }
    }
}
