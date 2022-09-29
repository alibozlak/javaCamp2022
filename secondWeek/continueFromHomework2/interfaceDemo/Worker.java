package interfaceDemo;

// Bizim çalışanımız 
public class Worker implements Workable, Eatable, Payable {

    @Override
    public void work() {
        System.out.println("Kendi çalışanlarımız çalıştı.");
    }
    
    @Override
    public void eat() {
        System.out.println("Kendi çalışanlarımız yemek yedi.");
    }

    @Override
    public void pay() {
        System.out.println("Kendi çalışanlarımıza maaşı verildi.");
    }
    
}
