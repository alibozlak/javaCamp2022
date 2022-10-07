package interfaceIlePolymorphism;

/**
 * Java Dersi 43 : Interface ile Polymorphism
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        // Strateji Tasarım Deseni ile :
        // CustomerManager customerManager = new CustomerManager();
        // customerManager.customerDal = new OracleCustomerDal();
        // customerManager.add();

        // Constructor Dependency Injection ile :
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}
