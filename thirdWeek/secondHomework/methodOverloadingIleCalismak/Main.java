package methodOverloadingIleCalismak;

/**
 * Java Dersi 35 : Method Overloading ile Çalışmak
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(8, 3));

        System.out.println(dortIslem.topla2(2, 5, 8));
        System.out.println(dortIslem.topla(2, 5, 8));
    }
}
