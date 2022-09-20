public class App {
    public static void main(String[] args) {
        
        // Java, C# gibi diller tip güvenlidir.

        int sayi = 45;
        // sayi = "text";
        sayi = 14;

        // Primitive Types :

        // int : integer (tamsayı için), 4 byte'lık yer kaplar. [2^31 , 2^31-1] arasındaki tamsayılar için.
        // byte : integer , 1 byte
        byte sayi1 = 45;  // [-128,127] arasındaki tamsayılar.
        // short : integer , 2 byte'lık yer kaplar. [2^15 , 2^15-1] arasındaki tamsayılar için.
        short sayi2 = 456;
        // long : integer , 8 byte'lık yer kaplar.  [2^63 , 2^63-1] arasındaki tamsayılar için.

        // double : Noktalı rasyonel sayılar için. 8 byte'lık yer kaplar.
        double sayi3 = 78.56;
        // float : Noktalı sayılar için. 4 byte'lık yer kaplar.
        float sayi4 = 45.41f;  // <-- Sonuna f koyulmalı.

        // İnteger sayıların defaultu int'dir.
        // Noktalı sayıların defaultu double'dır.

        // char : 2 byte'lık yer kaplar. Tek tırnak ile kullanılır.
        char ilkHarf = 'A';

        // boolean : Boolean veri türleri için. true veya false. 
        // Koşullarda ve Döngülerde kullanılır.
        boolean adimAliMi = true;

    }
}
