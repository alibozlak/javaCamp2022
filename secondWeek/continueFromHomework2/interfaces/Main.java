package interfaces;

/**
 * Interfaceler ile Çalışmak (Java Dersi 42)
 */
class Main {
    public static void main(String[] args) {
        System.out.println();

        // Bir class birden fazla interface'i implemente edebilir.  Ama sadece 1 classı extend edebilir.
        // Abstract classlar bir class iken interfaceler class değildir.

        // Interfaceler de abstractır, newlenemez!
        // ** Interfaceler kendisini implemente eden classların referansını tutabilir.. **
        CustomerDal customerDal = new MySqlCustomerDal();
        customerDal.add();
    }
}
