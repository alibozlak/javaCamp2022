package polymorphismDemo;

public class ConsoleLogger extends Logger {
    @Override
    public void log(String message) {
        System.out.println("Konsola loglanan mesaj : " + message);
    }
}
