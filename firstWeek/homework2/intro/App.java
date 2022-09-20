public class App {
    public static void main(String[] args) {
        
        // Yorum satırı. Tek satırlık yorum satırı. Program burayı okumaz.

        /*
            Buraya çok satırlı
            yorum yapılabilir. 

            Ama // ile çok 
            satırlı yorum yapılamıyordu.  
        */

        System.out.println("Hello Java!");
        // System.out.println() buradaki noktalar sınıflama (gruplama) yapmak için kullanılır.

        // Java, C#, C gibi dillerde her bir komut ; ile bitmelidir. Yanyana yazmak veya yazmamak farketmez.
        // Derleyici ; ile komutun bittiğini anlar.
        System
          .out
                .println
        (
            "Bu komutu yine çalıştıracak. Önemli olan ; "
        );

    }
}
