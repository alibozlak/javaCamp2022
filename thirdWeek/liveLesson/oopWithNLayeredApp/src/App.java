import business.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateProductDao;
// import dataAccess.JdbcProductDao;
import entities.Product;

/**
 * Java Yazılım Geliştirici Yetiştirme Kampı, 
 * 05.10.2022 Java Live Lesson 3, Engin Demiroğ,
 * OOP - Class & Interface ile Sürdürülebilirlik
 */
public class App {

    // 1) Data Access Katmanı
    // 2) Business Katmanı
    // *) API Katmanı
    // 3) UI (User Interface) Katmanı

    /**
     * Burayı UI katmanı gibi kullanacağız
     */
    public static void main(String[] args) throws Exception {
        System.out.println();

        Product product1 = new Product(1, "iPhone XR", 12_000);

        // ProductManager productManager = new ProductManager();   // <-- Dependency Injection'dan önce
        // ProductManager productManager = new ProductManager(new HibernateProductDao());  // <--- Loggerlardan önce
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
    }
}
