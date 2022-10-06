package dataAccess;

import entities.Product;

// DAO (Data Access Object)
// dataAccess katmanında sadece ve sadece database'e erişim kodları yazılır... SQL
// Single Responsibility Principle'ın katmana uygulanması : Her katman sadece kendi işini yapar.
public class JdbcProductDao implements ProductDao {
    
    @Override
    public void add(Product product) {
        System.out.println(product.getName() + ", JDBC ile veri tabanına eklendi!");
    }

}
