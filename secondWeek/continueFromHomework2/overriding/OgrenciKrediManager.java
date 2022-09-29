package overriding;

public class OgrenciKrediManager extends KrediManager {
    
    @Override
    public double hesapla(double tutar) {
        return tutar * 1.03;
    }

}
