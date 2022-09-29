package polimorphismDemo;

public class FileLogger extends Logger {
    
    @Override
    public void log(String message) {
        System.out.println("Dosyaya loglandı. Mesaj : " + message);
    }

}
