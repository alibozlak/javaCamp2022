package abstractClasses;

public abstract class GameCalculator {
    
    // Inherit eden classlar override etmek zorunda :
    public abstract void hesapla();

    // Inherit eden classlar bu metodu ezemez (değiştiremez)!
    public final void gameOver() {
        System.out.println("Oyun bitti!");
    }

}
