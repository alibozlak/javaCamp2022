/**
 * Methods2 : Parametreli Metodlarla Çalışmak
 */
public class App {
    public static void main(String[] args) {
        System.out.println();

        String message = "Bugün hava çok güzel";
        String subMessage = message.substring(0, 2);
        System.out.println(subMessage);

        int total = sum(12, 15);
        System.out.println("Toplam : " + total);
    }

    // void operasyon:
    public static void add() {
        System.out.println("Müşteri ekleme kodları çalıştı.");
    }

    // returnlü ve parametreli operasyon :
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
}