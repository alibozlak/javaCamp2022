/**
 * Daha önceden CreditManager ismi kullanıldı. Bundan dolayı bu interface'in isminin başına I koydum.
 * (<b>Java communitysinde interface isimlendirmede başa I koyulmaz.</b> Ben mecburen koydum bu interface'de.)
 */
public interface ICreditManager {
    void calculate();   // <-- Sadece metod imzası yazılır. (Default metodlar da yazılabilir ancak konuyla alakasız.)
    void delete();
}
