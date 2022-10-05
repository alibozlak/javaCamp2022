/**
 * IndividualCustomer is a Customer.
 * IndividualCustomer, Customer'daki private olmayan herşeye sahiptir artık (miras almıştır). 
 */
public class IndividualCustomer extends Customer {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
