package polimorphismDemo;

public class EmailLogger extends Logger {
    
    @Override
    public void log(String message) {
        System.out.println("Emaile loglandı. Mesaj : " + message);
    }

}
