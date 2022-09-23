/**
 * Introduction to Inheritance
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Customer customer1 = new Customer();
        Employee employee1 = new Employee();

        customer1.firstName = "Ali";
        customer1.lastName = "Bozlak";
        customer1.email = "ali-bozlak@outlook.com";

        employee1.firstName = "Engin";
        employee1.lastName = "Demiroğ";
        employee1.salary = 14_650;

        System.out.println("--- Operasyonalarda ---");

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        employeeManager.add();
        employeeManager.list();
        employeeManager.bestEmployee();

        customerManager.add();
        customerManager.list();

    }
    
}