/**
 * Inheritance :
 * Base classın, kendisini inherit eden classın referansını tutabilmesinin avantajı
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        // Yazılımda en önemli olgu DEĞİŞİMDİR.
        // Değişime direnmeyen programlar yazmalıyız.

        KrediUI krediUI = new KrediUI();

        // BaseKrediManager, hem OgretmenKrediManager'ın hem de TarimKrediManager'ın referansını tutabilir :
        krediUI.krediHesapla(new OgretmenKrediManager());
        krediUI.krediHesapla(new TarimKrediManager());

        // Birbirinin alternatifi olan geçişleri yapmak için if'leri kullanmamalıyız.
        // Aksi halde spagetti kod üretiriz.

        krediUI.krediHesapla(new AskerKrediManager());

        // Buna Polymorphism denmekte.

    }
    
}