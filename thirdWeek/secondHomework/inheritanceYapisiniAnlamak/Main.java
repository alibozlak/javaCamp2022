package inheritanceYapisiniAnlamak;

/**
 * Java Dersi 36 : Inheritance Yapısını Anlamak
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Customer customer1 = new Customer();
        Employee employee1 = new Employee();

        customer1.age = 30;
        employee1.age = 45;

        // Operasyon classlarında da aynı şey geçerlidir :
        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        customerManager.list();
        employeeManager.list();

        employeeManager.bestEmployee();     // --> bestEmployee(), EmployeeManager classına özel
    }
}
