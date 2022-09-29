package polimorphismDemo;

/**
 * Gerçek Hayatta Polimorfizm ile Çalışmak (Java Dersi 38)
 */
class Main {
    public static void main(String[] args) {
        System.out.println();

        // EmailLogger emailLogger = new EmailLogger();
        // emailLogger.log("Loglama yapıldı.");

        // int[] numbers = { 14, 5, -8, 7 };
        Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger() };
        
            // Base class kendisini inherit eden classların referansını tutabiliyor..  <--- Önemli
            // Bu sayede Plug and Play (Tak Çalıştır) sistemi kurabiliyoruz.

        for (Logger logger : loggers) {
            logger.log("foreach ile loglandı.");
        }

        System.out.println("------------");

        CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
        customerManager.add();
    }
    
}