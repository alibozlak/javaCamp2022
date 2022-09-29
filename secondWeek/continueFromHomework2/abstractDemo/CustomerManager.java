package abstractDemo;

public class CustomerManager {

    DatabaseManager databaseManager;

    public void getCustomers() {
        // OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
        // oracleDatabaseManager.getData();

        databaseManager.getData();
    }

}
