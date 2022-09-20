public class App {
    public static void main(String[] args) {
        
        // For Loop :  En çok tercih edilen döngü türü.
        // Döngünün ne kadar tekrarlanacağı belliyse for döngüsü kullanılır genelde.
        for (int i = 1; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("Döngü bitti.");

        for (int i = 1; i < 10; i += 2){
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti.");


        // While Loop :
        // Döngünün ne kadar tekrarlanacağı bilinmiyorsa while döngüsü kullanılır genelde.
        int i = 1;

        while (i < 10) {
            System.out.println("while ile : " + i);
            i++;    // <-- Bu koyulmazsa koşul hep sağlandığı için sonsuz döngüye girer.
        }

        System.out.println("While döngüsü bitti.");
        System.out.println(i);


        // Do-While Loop :
        // En az 1 kere çalışır. Diğer döngülerde hiç çalışmama durumu vardır.
        do {
            System.out.println("Do-While ile : " + i);
            i -= 3;
        } while (i > 0);

        System.out.println("Do-While döngüsü bitti.");
        System.out.println(i);

    }
}
