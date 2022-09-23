/**
 * Method Overloading
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        DortIslem dortIslem = new DortIslem();

        int toplam1 = dortIslem.topla(5, 4);
        System.out.println("2 parametreli toplam : " + toplam1);

        int toplam2 = dortIslem.topla(4, 5, 7);
        System.out.println("3 parametreli toplam : " + toplam2);

    }    
}