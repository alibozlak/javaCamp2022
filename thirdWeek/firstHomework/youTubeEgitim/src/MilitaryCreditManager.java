public class MilitaryCreditManager implements ICreditManager {

    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandı!");
    }

    @Override
    public void delete() {
        System.out.println("Asker kredisi silindi!");
    }
    
}
