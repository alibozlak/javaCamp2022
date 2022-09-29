package staticDemo;

// Java'da ana class static yapılamıyor. Ama inner class static yapılabiliyor.
public class ProductValidator {

    // Static yapıcı blok :
    // Birden fazla static yapıcı blok oluşturulabilir.
    static {
        System.out.println("Static yapıcı blok çalıştı.");
    }

    // Yapıcı bloklar (Constructors) newleme yapınca çalışır.
    public ProductValidator() {
        System.out.println("Yapıcı blok çalıştı.");
    }
    
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        }
        return false;
    }

    // public static class BaskaBirClass{
    //     public void birMetod() {
            
    //     }
    // }

}
