package inheritanceDemo;

/**
 * Java Dersi 37 : Inheritance Demo
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        // Değişime direnmeyen program yazmalıyız

        // OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        // ogretmenKrediManager.hesapla();

        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new AskerKrediManager());  // <-- Polymorphism aslında bu
    }
}
