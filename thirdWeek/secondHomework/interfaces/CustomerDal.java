package interfaces;

public interface CustomerDal {
    void add();
}

// Interface'ın üyeleri default olarak publictir.
// Interfaceler de abstractır, newlenemez.
// ***Interfaceler kendisini implemente eden classların referansını tutabilir.***