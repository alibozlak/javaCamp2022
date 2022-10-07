package methodOverloadingIleCalismak;

public class DortIslem {

    public int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public int topla2(int sayi1, int sayi2, int sayi3) {    // --> Bu yöntem kullanışlı değildir.
        return sayi1 + sayi2 + sayi3;
    }

    // topla metodunu overload edebiliriz :
    // Bir method AYNI İSİM FARKLI İMZAYLA overload edilebilir.
    public int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

}
