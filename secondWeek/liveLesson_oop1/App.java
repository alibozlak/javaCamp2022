public class App {
    public static void main(String[] args) {

        // String message = "Vade oranı";
        // dataType variableName = value (or reference);

        Product product1 = new Product();
        // Product --> DataType
        // product1 --> variableName

        // . (nokta) operatörüyle oluşturulan nesnenin fieldlarına ulaşılabilir.
        // . oparatörüyle product1 nesnesinin fieldlarına ulaşıp atama (set işlemi) yapalım :
        /*
            product1.name = "Delongi Kahve Makinesi";
            product1.unitPrice = 7500; // ---> 7_500 de yazılabilir, okunurluğu artırabilmek için.
            product1.discount = 7;
            product1.unitsInStock = 3;
            product1.imageUrl = "bilmemne.jpg";

            fieldları private yaptığımız için fieldlara direkt ulasamayız artık. 
            Silmek yerine yoruma aldım.
        */

        // Fieldları private yaptığımız için buradaki Main classından ulaşamayız. 
        // Onun için fieldlara atama yaparken set metodlarını kullanacağız :
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(4500);
        product1.setDiscount(9);
        product1.setUnitsInStock(4);
        product1.setImageUrl("bilmemne.jpg");

        // product1 nesnesinin name fieldına ulaşıp yazdıralım (okuyalım / get işlemi) :
        // System.out.println("Oluşturduğumuz product1'ın ismi : " + product1.name); // <-- name private oldu!
        System.out.println("Oluşturduğumuz product1'ın ismi : " + product1.getName()); // <-- Artık get metodu ile okuyacağız.

        System.out.println("--------------");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(4500);
        product2.setDiscount(9);
        product2.setUnitsInStock(4);
        product2.setImageUrl("bilmemne.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(4);
        product3.setImageUrl("bilmemne.jpg");

        Product[] products = { product1, product2, product3 };
        
        System.out.println("<ul>");
        for (Product product : products) {
            // System.out.println(product.name); // <--- name fieldına ulaşamayız artık. private yaptığımız için.
            System.out.println("  <li>" + product.getName() + "</li>"); // <-- getName() metodu ile okuma yapacağız. (Bakınız : Getters)
        }
        System.out.println("</ul>");


        System.out.println("------- Inheritance ---------");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("124554344");
        individualCustomer.setPhone("905 042 1556");

        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiroğ");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("154335443");
        corporateCustomer.setPhone("452 654 5487");

        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setTaxNumber("111254566");

        // Base classın kendisini extend eden classların referansını (adresini) tutma avantajı :
        Customer[] customers = { individualCustomer, corporateCustomer};

        System.out.println("İki farklı müşteri türünden iki müşterinin telefon numaralarını yazdıralım :");
        for (Customer customer : customers) {
            System.out.println(customer.getPhone());
        }

    }
}
