package abstractDemo;

public class MySqlDatabaseManager extends DatabaseManager {

    @Override
    public void getData() {
        System.out.println("MySQL'den veri getirildi");
    }
    
}
