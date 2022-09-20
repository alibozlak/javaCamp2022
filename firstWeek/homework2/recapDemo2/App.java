public class App {
    public static void main(String[] args) {

        // double[] myList = new double[4];
        double[] myList = { 1.2, 6.3, 4.3, 5.6 };

        double sum = 0;
        double greatestNumber = myList[0];
        for (double number : myList) {
            System.out.println(number);
            sum += number;
            if (greatestNumber < number) {
                greatestNumber = number;
            }
        }
        System.out.println("Toplam : " + sum);
        System.out.println("En büyük sayı : " + greatestNumber);

    }
}
