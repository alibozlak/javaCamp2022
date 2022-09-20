import java.util.Scanner;

/**
 * Mini Proje 4 - Arkadaş Sayılar : Kullanıcıdan alınan sayılar arkadaş mı?
 */
public class ArkadasSayilar {
    public static void main(String[] args) {
        // 220 - 284 arkadaştır.
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nİki tane pozitif doğal sayı girmelisiniz.");
        System.out.print("İlk sayıyı giriniz : ");
        int number1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int number2 = scanner.nextInt();
        scanner.close();

        if (number1 < 1 || number2 < 1) {
            System.out.println("\nKurala uygun sayı girmeniz gerekmektedir!");
            return;
        }

        if (isFriendNumbers(number1, number2)) {
            System.out.println("\nGirdiğiniz sayılar arkadaştır.");
        } else {
            System.out.println("\nGirdiğiniz sayılar arkadaş değildir.");
        }
    }

    private static boolean isFriendNumbers(int number1, int number2) {
        int sum1 = sumOfPositiveDivisorsExceptItself(number1);
        int sum2 = sumOfPositiveDivisorsExceptItself(number2);
        if (number1 == sum2 && number2 == sum1) {
            return true;
        }
        return false;
    }

    private static int sumOfPositiveDivisorsExceptItself(int naturalNumber) {
        int sum = 1;
        int half = naturalNumber / 2;
        for (int i = 2; i <= half; i++) {
            if (naturalNumber % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
