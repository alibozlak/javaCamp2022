/**
 * Field (Attribute) Tutan Classlar
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Product product = new Product();
        product.name = "Laptop";
        System.out.println("Ürünün ismi : " + product.name);
        product.id = 1;
        product.description = "Asus, 8 GB ram";
        product.price = 14_500;
        product.stockAmount = 8;

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        // *** SOLID ***
        // Sinle Responsibility Principle : Tek Sorumluluk Prensibi

        // Bir class hem attribute hem de operasyonlar içermemeli.
    }
    
}