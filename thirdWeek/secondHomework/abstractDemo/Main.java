package abstractDemo;

/**
 * Java Dersi 41 : Demo - Abstract Sınıfları Pekiştirmek
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();
    }
}
