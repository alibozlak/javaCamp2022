package kodlamaio.core.logging;

public class FileLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Dosyaya şu mesaj loglandı : " + message);
    }
    
}
