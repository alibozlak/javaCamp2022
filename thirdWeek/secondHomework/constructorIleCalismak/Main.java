package constructorIleCalismak;

/**
 * Java Dersi 34 : Constructor ile Çalışmak
 */
public class Main {

    public static void main(String[] args) {
        System.out.println();

        Product product1 = new Product(1, "Laptop", "Asus Laptop", 7_800, 4, "siyah");
        System.out.println(product1.getKod());
    }
}