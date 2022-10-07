package polymorphismDemo;

/**
 * Java Dersi 38 : Gerçek Hayatta Polimorfizm ile Çalışmak
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        // EmailLogger emailLogger = new EmailLogger();
        // emailLogger.log("log mesajı");

        // Logger, kendisini extend eden FileLogger, EmailLogger ve DatabaseLogger'ın referansını tutabilir :
        // (FileLogger, EmailLogger ve DatabaseLogger bir Logger'dır)
        Logger[] loggers = { new FileLogger(), new DatabaseLogger(), new EmailLogger(), new ConsoleLogger() };

        for (Logger logger : loggers) {
            logger.log("foreach döngüsünden loglandı");
        }

        System.out.println("---------");

        CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
        customerManager.add();
    }
}
