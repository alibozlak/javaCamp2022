import java.util.Scanner;

/**
 * Mini Proje 3 - Mükemmel Sayılar :
 * Kullanıcıdan alınan bir doğal sayının mükemmel olup olmadığı
 */
public class MukemmelSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n1'den büyük bir doğal sayı giriniz : ");
        int number = scanner.nextInt();
        scanner.close();

        String message = "\nGirdiğiniz sayı mükemmel sayı";
        if (isAwesomeNumber(number)) {
            System.out.println(message + "dır.");
        } else {
            System.out.println(message + " değildir.");
        }
    }

    private static boolean isAwesomeNumber(int naturalNumber){
        if (naturalNumber < 2) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i <= (naturalNumber/2); i++) {
            if (naturalNumber % i == 0) {
                sum += i;
            }
        }

        if (sum == naturalNumber) {
            return true;
        }
        return false;
    }
}
