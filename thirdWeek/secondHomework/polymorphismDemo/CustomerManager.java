package polymorphismDemo;

public class CustomerManager {
    private Logger logger;
    
    public CustomerManager(Logger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Müşteri eklendi");

        // DatabaseLogger logger = new DatabaseLogger();   // <-- DatabaseLogger'a BAĞIMLILIK oluşturur!
        // logger.log("Müşteri eklendi");

        logger.log("Müşteri eklendi");
    }
}
