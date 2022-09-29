package abstractClasses;

/**
 * Abstract Sınıflarla Çalışmak (Java Dersi 40)
 */
class Main {
    public static void main(String[] args) {
        System.out.println();

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();

        System.out.println("---------------");

        // Abstract classlar newlenemez! Kendisinden nesne oluşturulamaz!

        GameCalculator gameCalculator = new KidGameCalculator();
        gameCalculator.hesapla();
    }
}
