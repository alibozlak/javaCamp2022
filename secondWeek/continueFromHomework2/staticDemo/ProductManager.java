package staticDemo;

public class ProductManager {
    
    public void add(Product product) {
        
        // ProductValidator productValidator = new ProductValidator();

        if (ProductValidator.isValid(product)) {
            System.out.println(product.name + " adlı ürün eklendi.");
        } else {
            System.out.println("Ürün bilgileri geçersizdir!");
        }
    }

}
