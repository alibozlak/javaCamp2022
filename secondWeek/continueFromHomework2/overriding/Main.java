package overriding;

/**
 * Overriding Altyapısıyla Çalışmak (Java Dersi 39)
 */
class Main {
    public static void main(String[] args) {
        System.out.println();

        KrediManager[] krediManagers = { 
            new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()
        };

        for (KrediManager krediManager : krediManagers) {
            System.out.println("Geri ödenmesi gereken tutar : " + krediManager.hesapla(10_000));
        }
    }
}
