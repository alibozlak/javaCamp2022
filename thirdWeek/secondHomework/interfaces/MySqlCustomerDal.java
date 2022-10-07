package interfaces;

public class MySqlCustomerDal implements CustomerDal {

    @Override
    public void add() {
        System.out.println("Müşteri MySQL veritabanına eklendi");
    }
    
}
