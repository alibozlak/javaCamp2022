package overriding;

public class KrediManager {
    
    public double hesapla(double tutar) {
        return tutar * 1.08;
    }

    // Java'da metodlar overrabledır (ezilebilir).
    // Metod ezmeyi engellemek için 'final' keywordu kullanmak gerekiyor :
    /*
    public final double hesapla(double tutar) {
        return tutar * 1.08;
    }
    */

}
