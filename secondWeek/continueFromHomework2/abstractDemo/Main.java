package abstractDemo;

/**
 * Demo - Abstract Sınıfları Pekiştirmek (Java Dersi 41)
 */
class Main {
    public static void main(String[] args) {
        System.out.println();

        // CustomerManager customerManager = new CustomerManager(new SqlServerDatabaseManager());

        // Strateji Tasarım Deseni :
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager();
        customerManager.getCustomers();

        // SOLID'in O harfi (Open Closed Principle) : 
        // Bir sisteme yeni bir özellik getirildiğinde mevcuttaki hiçbir kodu değiştiremezsin.
    }
}
