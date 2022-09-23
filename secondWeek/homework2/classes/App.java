/**
 * Classlar
 */
public class App {
    public static void main(String[] args) {
        System.out.println();

        // Sürdürülebilir yazılım : İnsanın ihtiyaçlarına direnmeyen program.

        // Classların ilk amacı GRUPLAMA yapmaktır.

        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.update();
        customerManager.remove();

        // Classlar referans tiptir. (Reference type)
        // İsimlendirmelerde kısaltma kullanılmamalı, okunabilirlik için.

        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2; // --> customerManger2'nin referansını customerManager'a ata.

        // ** İlk üretilen nesne referanssız kaldı. **
        // GC, referansı olmayan nesneleri bellekten temizler.
        
        // Nesne sadece ihtiyaç olduğunda üretilmeli, çünkü new pahalıdır.
    }
    
}