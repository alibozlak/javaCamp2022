public class App {
    public static void main(String[] args) {
        
        int sayi = 41;

        if (sayi > 20) {
            System.out.println("Sayi 20'den büyüktür.");
        }

        if (sayi < 35) {
            System.out.println("Sayi 35'ten küçüktür.");
        }

        // ---- 

        if (sayi < 30) {
            System.out.println("Sayi 30'dan küçüktür.");
        } else {
            System.out.println("Sayi 30'dan küçük değildir.");
        }

        // -----

        if (sayi > 40) {
            System.out.println("Sayi 40'tan büyüktür.");
        } else if (sayi == 40) {
            System.out.println("Sayi 40'a eşittir.");
        } else {
            System.out.println("Sayi 40'tan küçüktür.");
        }

    }
}
