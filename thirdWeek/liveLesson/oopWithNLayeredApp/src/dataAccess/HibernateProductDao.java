package dataAccess;

import entities.Product;

public class HibernateProductDao implements ProductDao {
    
    @Override
    public void add(Product product) {
        System.out.println(product.getName() + ", Hibernate ile veri tabanına eklendi!");
    }


}
