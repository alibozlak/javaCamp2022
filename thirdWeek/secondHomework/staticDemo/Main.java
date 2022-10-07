package staticDemo;

/**
 * Java Dersi 45 : Composition - Inner Class ve Static
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Product product1 = new Product(1, "Laptop", 17_400);

        ProductManager productManager = new ProductManager();
        productManager.add(product1);

        System.out.println("-----");

        DatabaseHelper.Crud.delete();
        DatabaseHelper.Crud.update();
        DatabaseHelper.Connection.createConnection();

    }
}

// staticler genelde utility (araç) yazarken kullanılır.
// staticler bir kez tanımlanır ve uygulama durana (kapatılana) kadar bellekten atılmıyor.

// Inner class kullanmak tavsiye edilmiyor. SOLID'in S'sine (Single Responsibility Principle) aykırı.