package polymorphismDemo;

public class DatabaseLogger extends Logger {
    @Override
    public void log(String message) {
        System.out.println("Veritabanına loglanan mesaj : " + message);
    }
}
