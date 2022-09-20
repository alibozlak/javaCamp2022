public class App {
    public static void main(String[] args) {

        // Switch-Case :

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel. Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel. Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi. Geçtiniz");
                break;
            case 'D':
                System.out.println("Geçtiniz, İsterseniz bütünlemeye girebilirsiniz.");
                break;
            case 'E':
            case 'F':
                System.out.println("Maalesef kaldınız.");
                break;
            default:
                System.out.println("Geçersiz bir harf notu");
                break;
        }

    }
}
