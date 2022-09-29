package interfacePolymorphism;

public class CustomerManager {

    private CustomerDal customerDal;
    
    public CustomerManager(CustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        // Business codes here
        System.out.println("Müşteri için iş kodları çalıştı.");

        // Şu OracleCustomerDal'a bağımlılık yapıyor :
        // OracleCustomerDal oracleCustomerDal = new OracleCustomerDal();
        // oracleCustomerDal.add();

        customerDal.add();
    }

}
