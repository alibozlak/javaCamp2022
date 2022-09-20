/**
 * Mini Proje 2 - Kalın Sesli ve İnce Sesli Harfler
 */
public class KalinSesliInceSesli {

    public static void main(String[] args) {
        
        char vowel = 'I';

        String message = "\nGirdiğiniz harf ";
        switch (vowel) {
            case 'a': case 'A': 
            case 'ı': case 'I': 
            case 'o': case 'O': 
            case 'u': case 'U': 
                System.out.println(message + "kalın sesli.");
                break;
            case 'e': case 'E': 
            case 'i': case 'İ': 
            case 'ö': case 'Ö': 
            case 'ü': case 'Ü': 
                System.out.println(message + "ince sesli.");
                break;
            default:
                System.out.println("Geçersiz harf");
                break;
        }
    }
}