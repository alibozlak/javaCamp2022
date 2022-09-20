import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        // En büyük sayı hangisi?
        Scanner scanner = new Scanner(System.in);   // <-- Kullanıcıdan veri almak için.
        System.out.print("\n1.sayıyı giriniz : ");
        int number1 = scanner.nextInt();
        System.out.print("2.sayıyı giriniz : ");
        int number2 = scanner.nextInt();
        System.out.print("3.sayıyı giriniz : ");
        int number3 = scanner.nextInt();
        scanner.close();

        // if (number1 >= number2 && number1 >= number3) {
        //     System.out.println("\nEn büyük sayı ilk girilen sayıdır : " + number1);
        // } else if (number2 >= number1 && number2 >= number3) {
        //     System.out.println("\nEn büyük sayı ikinci girilen sayıdır : " + number2);
        // } else {
        //     System.out.println("\nEn büyük sayı son girilen sayıdır : " + number3);
        // }


        // Hocanın çözümü daha güzel :
        int enBuyuk = number1;

        if (enBuyuk < number2) {
            enBuyuk = number2;
        }
        if (enBuyuk < number3) {
            enBuyuk = number3;
        }

        System.out.println("\nEn büyük sayı : " + enBuyuk);

    }
}
