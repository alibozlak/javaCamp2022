package staticDemo;

public class ProductManager {

    public void add(Product product) {

        // ProductValidator productValidator = new ProductValidator();

        if (ProductValidator.isValid(product)) {    // <-- Static metodun çağırılması
            System.out.println(product.name + " adlı ürün eklendi");
        } else {
            System.out.println(product.name + " adlı ürün eklenemedi!");
        }        
    }
}
