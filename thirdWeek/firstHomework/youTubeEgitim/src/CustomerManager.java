public class CustomerManager {

    private Customer _customer;
    private ICreditManager _creditManager;
    
    public CustomerManager(Customer _customer) {
        this._customer = _customer;
    }

    // Interface konusunda oluşturulan constructor :
    public CustomerManager(Customer customer, ICreditManager creditManager) {
        _customer = customer;
        _creditManager = creditManager;
    }

    // public void save(Customer customer) {    // <-- Constructor konusunda iptal edildi
    //     System.out.println(customer.firstName + " " + customer.lastName + " kaydedildi");
    // }

    // public void save() {     // <-- Inheritance konusunda kaldırıldı
    //     System.out.println(_customer.firstName + " " + _customer.lastName + " kaydedildi");
    // }

    // public void delete() {     // <-- Inheritance konusunda kaldırıldı
    //     System.out.println(_customer.firstName + " " + _customer.lastName + " silindi");
    // }

    public void save() {
        System.out.println(_customer.id + " id'li müşteri eklendi");
    }

    public void delete() {
        System.out.println(_customer.id + " id'li müşteri silindi");
    }

    public void giveCredit() {
        _creditManager.calculate();
        System.out.println("Kredi verildi!");
    }
}
