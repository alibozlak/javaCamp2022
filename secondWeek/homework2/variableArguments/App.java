/**
 * Variable Arguments ile Çalışmak
 */
public class App {
    public static void main(String[] args) {
        System.out.println();

        System.out.println(sum(2,3));
        System.out.println(sum(2,3,5));
        System.out.println(sum(2,3,5,7));
    }

    // int...  --> istediğimiz kadar int verebilmek için. (Variable Arguments)
    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

}