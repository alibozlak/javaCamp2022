package abstractDemo;

public class SqlServerDatabaseManager extends DatabaseManager {

    @Override
    public void getData() {
        System.out.println("SQL Server'dan veri getirildi");
    }
    
}
