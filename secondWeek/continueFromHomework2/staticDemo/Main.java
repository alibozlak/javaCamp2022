package staticDemo;

/**
 * Static, Inner Class and Composition (Java Dersi 45)
 */
class Main {

    // Staticleri genellikle utility (araç) amaçlı kullanırız

    public static void main(String[] args) {
        System.out.println();

        ProductManager productManager = new ProductManager();

        Product product1 = new Product(1, "Laptop", 23_500);

        productManager.add(product1);
        System.out.println("------------");

        Product product2 = new Product(2, "", 12_300);
        productManager.add(product2);
        System.out.println("------------");

        DatabaseHelper.Crud.Update();
        DatabaseHelper.Connection.createConnection();

        // Best practiceler inner class kullanmayın demekte! 
        // Single Responsibility Principle'a aykırı. Bir classın tek bir görevi olmalı.
    }
}
