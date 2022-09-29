package abstractDemo;

public class OracleDatabaseManager extends DatabaseManager {

    @Override
    public void getData() {
        System.out.println("Oracle tabanından veri getirildi.");
    }
    
}
