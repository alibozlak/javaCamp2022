package interfaces;

public class OracleCustomerDal implements CustomerDal {

    @Override
    public void add() {
        System.out.println("Müşteri Oracle veritabanına eklendi");
    }
    
}
