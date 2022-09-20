public class App {
    public static void main(String[] args) throws Exception {
        
        // Strings :

        String message = "Bugün hava çok güzel";
        System.out.println(message);

        // Stringler bir karakter dizisidir (char[]).

        // Metin uzunluğu :
        System.out.println("Eleman sayısı : " + message.length());

        // i. indisteki karakter :
        System.out.println("5. Eleman : " + message.charAt(4));
        System.out.println("-----");

        // Metin birleştirme :
        System.out.println(message.concat(". Yaşasın"));
        System.out.println(message);
        System.out.println("-----");

        // x ile başlıyor mu? 
        System.out.println("B ile başlıyor mu : " + message.startsWith("B"));
        System.out.println("H ile başlıyor mu : " + message.startsWith("H"));
        // x ile bitiyor mu?
        System.out.println("l ile bitiyor mu : " + message.endsWith("l"));
        System.out.println("k ile bitiyor mu : " + message.endsWith("k"));
        System.out.println("-----");

        // Yazdığım kaçıncı indiste? Aradığın metin yoksa -1 döner.
        System.out.println("mesajda 'hava' var mı? Varsa kaçıncı indiste : " + message.indexOf("hava"));
        // Sondan arama :
        System.out.println("mesajda a'yı sondan ara : " + message.lastIndexOf("a"));
        System.out.println("-----");

        // replace :
        System.out.println("Boşluklar yerine - koyalım : " + message.replace(" ", "-"));
        System.out.println(message);
        System.out.println("-----");

        // substring :
        System.out.println("6. indisten itibaren al : " + message.substring(6));
        System.out.println("6. ile 12. indis arasını al : " + message.substring(6,12));
        System.out.println("-----");

        // split : x'e göre kelimeleri ayır, dizi oluştur ve bana ver
        String[] words = message.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("-----");

        // toLowerCase :
        System.out.println("mesajı küçük harfe çevir : " + message.toLowerCase());
        // toUpperCase :
        System.out.println("mesajı büyük harfe çevir : " + message.toUpperCase());
        System.out.println("-----");

        // Başındaki ve sonundaki boşlukları kaldır :
        String message2 = "      Bugün hava   çok güzel.      ";
        System.out.println("mesaj2'nin kendisi :");
        System.out.println(message2);
        System.out.println("trim() metodu ile : ");
        System.out.println(message2.trim());
        System.out.println("-----");

        // char[]'e ata :
        // char[] ilk5karakter = new char[5];
        // message.getChars(0, 5, ilk5karakter, 0);

        // for (char karakter : ilk5karakter) {
        //     System.out.println(karakter);
        // }
        // System.out.println("-----");

    }
}
