/**
 * Methods
 */
public class App {
    public static void main(String[] args) {

        System.out.println();

        // Don't Repeat Yourself (DRY) (Kendini tekrar etme prensibi)
        // Bir kez yazıp tekrar tekrar kullanabilmek için fonksiyonlar (metodlar) yazarız.

        sayiBulmaca(5); // <-- metod (fonksiyon) çağırma
        sayiBulmaca(6);
        sayiBulmaca(9);

    }

    // Metod isimleri Java'da camelCase yazılır.
    public static void sayiBulmaca(int aranacak) {
        int[] numbers = { 1, 2, 5, 7, 9, 0 };
        boolean isExist = false;

        for (int number : numbers) {
            if (number == aranacak) {
                isExist = true;
                break;
            }
        }

        if (isExist) {
            mesajVer("Aranılan sayı vardır. Sayı : " + aranacak);
        } else {
            mesajVer("Aranılan sayı yoktur. Sayı : " + aranacak);;
        }
    }

    public static void mesajVer(String message) {
        System.out.println(message);
    }

}
