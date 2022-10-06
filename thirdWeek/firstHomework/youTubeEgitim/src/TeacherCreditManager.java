public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandı!");
    }

    @Override
    public void delete() {
        System.out.println("Öğretmen kredisi silindi!");
    }

    // BaseCreditManager'daki add abstract metodu override edilmeli :
    @Override
    public void add() {
        System.out.println("Öğretmen kredisi eklendi!");
    }
    
}
