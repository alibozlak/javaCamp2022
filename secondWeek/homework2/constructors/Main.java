/**
 * Constructors
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Laptop");
        product1.setDescription("Asus, 12 GB ram");
        product1.setPrice(4_450);
        product1.setStockAmount(4);

        Product product2 = new Product(2, "Mouse", "A4 Tech", 45, 13);

        System.out.println("İlk ürünün fiyatı : " + product1.getPrice());
        System.out.println("İkinci ürünün fiyatı : " + product2.getPrice());

    }    
}