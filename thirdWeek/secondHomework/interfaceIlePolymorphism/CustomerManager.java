package interfaceIlePolymorphism;

public class CustomerManager {

    private CustomerDal customerDal;
    
    // Constructor Dependency Injection
    public CustomerManager(CustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        // Business codes here
        // 
        // 
        System.out.println("İş kodları çalıştı");

        // OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();   // <-- Oracle'a bağımlılık
        
        customerDal.add();
    }
}
