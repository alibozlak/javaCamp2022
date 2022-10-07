package abstractClasses;

/**
 * Java Dersi 40 : Abstract Sınıflarla Çalışmak
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

        System.out.println("---------");

        GameCalculator gameCalculator = new KidGameCalculator();
        gameCalculator.calculate();
        gameCalculator.gameOver();
    }
}
