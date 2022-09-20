import java.util.Random;
import java.util.Scanner;

/**
 * Mini Proje 5 - Sayı Bulma
 */
public class SayiBulma {
    public static void main(String[] args) {

        // Önce 5 elemanlı, elemanları 1-20 arasında olan bir dizi oluşturalım : 
        int[] numbers = new int[5];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 20);
        }

        // Kullanıcıdan 1 ile 20 arasında bir doğal sayı alalım :
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n1 ile 20 arasında bir doğal sayı giriniz : ");
        int number = scanner.nextInt();
        scanner.close();

        // Kullanıcı sayıyı buldu mu? Bulamadı mı?
        boolean isExist = false;
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                isExist = true;
                break;
            }
        }

        // Çıktıyı verme :
        if (isExist) {
            System.out.println("\nSayıyı buldunuz!");
        } else {
            System.out.println("\nSayıyı bulamadınız!");
        }

        // Rasgele oluşan sayıları yazdırma :
        System.out.print("Sayılar : ");
        for (int _number : numbers) {
            System.out.print(_number + "  ");
        }
        System.out.println();

    }
}
