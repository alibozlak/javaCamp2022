package polimorphismDemo;

public class CustomerManager {

    private Logger logger;
    
    public CustomerManager(Logger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Müşteri eklendi.");
        // Konsola loglama yapmak istiyoruz :
        logger.log("CustomerManager ile loglandı.");
    }

}
