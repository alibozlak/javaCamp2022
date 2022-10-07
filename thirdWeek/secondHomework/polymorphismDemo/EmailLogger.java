package polymorphismDemo;

public class EmailLogger extends Logger {
    @Override
    public void log(String message) {
        System.out.println("Emaile gönderilen mesaj : " + message);
    }
}
