package abstractClasses;

public abstract class GameCalculator {

    public abstract void calculate();

    // Game Over kimsede değişmeyecek :
    public final void gameOver() {
        System.out.println("Oyun bitti!");
    }
}

// Abstract bir classta illa abstract method olmak zorunda değil.
// Abstract class newlenemez. Bir nesnesi (örneği) oluşturulamaz.