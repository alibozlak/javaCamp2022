package polimorphismDemo;

public class ConsoleLogger extends Logger {
    
    @Override
    public void log(String message) {
        System.out.println("Konsola loglandı. Mesaj : " + message);
    }

}
