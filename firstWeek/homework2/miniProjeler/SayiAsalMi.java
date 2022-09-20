import java.util.Scanner;

/**
 * Mini Proje 1 - Sayı Asal Mı? :
 * Kullanıcıdan alınan bir doğal sayının asal olup olmadığını bulma
 */
public class SayiAsalMi {

    public static void main(String[] args) {
        
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("1'den büyük bir doğal sayı giriniz : ");
        int number = scanner.nextInt();
        scanner.close();

        String message = "\nGirdiğiniz sayı ";
        if (isPrime(number)) {
            System.out.println(message + "asaldır.");
        } else {
            System.out.println(message + "asal değildir.");
        }

    }

    private static boolean isPrime(int naturalNumber){
        if (naturalNumber < 2) {
            return false;
        } else if (naturalNumber == 2) {
            return true;
        }

        for (int i = 2; i <= (naturalNumber/2); i++) {
            if (naturalNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}