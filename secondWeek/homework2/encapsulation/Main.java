/**
 * Encapsulation
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Product product = new Product();
        // product.price = -9000;  // <--- negatif değer!

        product.setPrice(-9000);
        System.out.println("Fiyatı negatif değer verdiğimizde price'a atanan değer  0 : " + product.getPrice());

        product.setPrice(9000);
        System.out.println("Fiyatı yanlış girmezsek kendi değeri atanır : " + product.getPrice());

        System.out.println("------");

        product.setName("Asus Laptop");
        product.setId(1);
        product.setDescription("12 GB RAM ,1 TB ROM");
        product.setStockAmount(8);
        
        // Ürün kodunu sadece okunabilir yaptık. Sadece getterı var.
        System.out.println("Ürün kodu : " + product.getCode());

    }    
}