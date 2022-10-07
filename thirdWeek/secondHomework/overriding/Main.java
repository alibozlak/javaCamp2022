package overriding;

/**
 * Java Dersi 39 : Overriding Altyapısıyla Çalışmak
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        // OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        // System.out.println(ogretmenKrediManager.hesapla(1_000));

        KrediManager[] krediManagers 
        = { new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager() };

        for (KrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1_000));
        }
    }
}
