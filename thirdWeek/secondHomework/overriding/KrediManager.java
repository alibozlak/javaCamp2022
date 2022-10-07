package overriding;

public class KrediManager {
    public double hesapla(double tutar) {
        return tutar * 1.14;
    }
}

// Java'da methodlar default olarak OVERRIDABLEdır (ezilebilirdir).
// Bir metodun ezilmesini istemiyorsak metoda "final" keywordu koyulur.