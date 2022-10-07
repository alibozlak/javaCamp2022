package polymorphismDemo;

public class FileLogger extends Logger {
    @Override
    public void log(String message) {
        System.out.println("Dosyaya loglanan mesaj : " + message);
    }
}
