package interfacePolymorphism;

/**
 * Interface ile Polymorphism (Java Dersi 43)
 */
class Main {
    public static void main(String[] args) {
        System.out.println();

        // CustomerManager customerManager = new CustomerManager();
        // customerManager.customerDal = new OracleCustomerDal();
        // customerManager.add();

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}
