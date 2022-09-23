/**
 * Value Types And Reference Types
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        // Value Types :
        // Primitive types are value types.
        int number1 = 10;
        int number2 = 20;
        number2 = number1;  // number2'ın değeri = number1'ın değeri   // --> number2 = 10
        number1 = 30;       
        System.out.println("Sayı 2 : " + number2);  // Sayı 2 : 10

        // Reference Types :
        // Arrays are reference types.
        int[] numbers1 = new int[]{1,2,3};
        int[] numbers2 = new int[]{4,5,6};
        numbers2 = numbers1;  // numbers2'nun referansı = numbers1'ın referansı
        // Artık numbers2 da ilk arrayin adresini tutuyor. İkinci array çöp oldu.
        numbers1[0] = 10;
        System.out.println("Sayılar 2'nin ilk elemanı : " + numbers2[0]);  // 10
    }
    
}