package polimorphismDemo;

public class DatabaseLogger extends Logger {
    
    @Override
    public void log(String message) {
        System.out.println("Veritabanına loglandı. Mesaj : " + message);
    }

}
