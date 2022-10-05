/**
 * Bu class hem Bireysel Müşterilerin hem de Kurumsal Müşterilerin base'i olacak. 
 * Ortak alanlarını burada tutacağız.
 */
public class Customer {

    private int id;
    // Üzerinde matematiksel işlemler yapılmıyorsa String yapılmalı. 
    // phone ve customerNumber alanları gibi :
    private String customerNumber;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
