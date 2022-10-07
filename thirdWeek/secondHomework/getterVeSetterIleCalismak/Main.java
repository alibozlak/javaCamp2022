package getterVeSetterIleCalismak;

/**
 * Java Dersi 33 : Getter ve Setter ile Çalışmak
 */
public class Main {

    public static void main(String[] args) {
        System.out.println();

        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Laptop");
        product1.setDescription("Asus Laptop");
        product1.setPrice(5_200);
        product1.setStockAmount(3);

        System.out.println(product1.getKod());
    }
}