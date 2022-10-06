public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();

        //#region Diffrence Between Value Types and Refrence Types :
        // Primitive tipler değer tiptir.
        int number1 = 10;
        int number2 = 20;
        number1 = number2;  // --> number2'nun DEĞERİNİ number1'a ata
        number2 = 100;
        System.out.println(number1);    // 20

        // Arrayler referans tiptir.
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {10, 20, 30};
        numbers1 = numbers2;    // --> numbers2'nun REFERANSINI numbers1'a ata
        numbers2[0] = 1000;
        System.out.println(numbers1[0]);    // 1000
        //#endregion

        System.out.println("-----------");

        //#region Classes :
        // Class kullanımının en önemli amaçlarından biri SINIFLAMA yapmaktır.
        // Benzer operasyonlar aynı classta toplanır.
        CreditManager creditManager = new CreditManager();  // new --> instance creation in Heap
        creditManager.calculate();
        creditManager.save();

        // Classlar 2 çeşittir : Operasyon tutan classlar, Özellik tutan classlar.
        // CreditManager classı --> Operasyon tutan class
        // Customer classı      --> Özellik tutan class

        // SOLID prensipleri
        // S : Single Responsibility Principle (Tek Sorumluluk Prensibi)
        // Bir class, bir metod veya bir paketin tek sorumluluğu olmalı.
        // Bundan dolayı Özellik tutan sınıflara metodlar eklenmemeli. 

        Customer customer1 = new Customer();
        customer1.id = 1;
        customer1.city = "Denizli";
        // customer1.firstName = "Engin";    // <-- Person müşterisine aktarıldı Inheritance konusunda
        // customer1.lastName = "Demiroğ";    // <-- Person müşterisine aktarıldı Inheritance konusunda
        // customer1.nationalIdentity = "123456789";    // <-- Person müşterisine aktarıldı Inheritance konusunda

        // CustomerManager customerManager = new CustomerManager();
        // customerManager.save(customer1);

        //#endregion

        System.out.println("-----------");

        //#region Constructor :
        CustomerManager customerManager = new CustomerManager(customer1);
        // Dezavantajı : Buradaki customerManager tek bir müşteri için işlem yapabilir. 
        // Avantajı : save(), delete gibi operasyonlarına müşteri parametresi vermek gerekmez.
        customerManager.save();
        customerManager.delete();

        //#endregion

        System.out.println("-----------");

        //#region Inheritance :
        Company company1 = new Company();
        company1.id = 2;    // <-- Base classtaki özellikleri ve operasyonları alır.
        company1.city = "İzmir";

        company1.taxNumber = "1534354346";
        company1.companyName = "Arçelik";

        Person person1 = new Person();
        person1.id = 3;     // <-- Base classtaki özellikleri ve operasyonları alır.
        person1.city = "İzmir";

        person1.firstName = "Ali";
        person1.lastName = "Bozlak";
        person1.nationalIdentity = "45667852543";

        // Base class kendisini extend eden classın referansını tutabilir :
        CustomerManager customerManager2 = new CustomerManager(person1);

        // Aslında CustomerManager constructorda bir Customer istiyor, 
        // Ancak biz Person verdiğimizde tip güvenli bir dil olan Java ses çıkarmıyor.
        // Bunun sebebi Person'ın Customer'ı extend etmesi ve base classın (yani Customer'ın) 
        // kendisini extend eden Person'ın referansını tutabilmesi. (Yani Person'ın bir Customer olması.)
        // (Person is a Customer.)
        // **SÜRDÜRÜLEBİLİR (DEĞİŞİME DİRENÇ GÖSTERMEYEN) bir program için bu özelliği sık sık kullanacağız.**

        Customer customer2 = new Customer();
        Customer customer3 = new Person();  // <-- Person is a Customer
        Customer customer4 = new Company(); // <-- Company is a Customer

        // Bir sınıf sadece bir sınıfı inherit edebilir.

        //#endregion

        System.out.println("-----------");

        //#region Interface
        // *****Interfaceler yazılımda bağımlılığı önlemek amacıyla kullanılır..******
        // sonar qube  --> Yazılım kalitesi ölçmek için kullanılabilir.

        // **Interfaceler de referans tiptir. Kendisini implemente eden classın referansını tutabilir..**
        CustomerManager customerManager3 = new CustomerManager(customer3, new TeacherCreditManager());
        // Burada ICreditManager TeacherCreditManager'ın referansını tuttu.
        customerManager3.giveCredit();

        // Bir sınıf birden fazla interface'i implement edebilir.

        //#endregion

        System.out.println("-----------");

        //#region Abstract Class :
        // Abstract sınıflar sınıf özelliği gösterir. Abstract sınıflar da bir sınıftır.
        // Abstract sınıflar ve interfaceler newlenemez. 
        // BaseCreditManager abstract sınıfı oluşturuldu. TeacherCreditManager bu classı extend etti.

        // Java'da metodlar default olarak virtual'dır.. (Ezilebilir)

        //#endregion
    }
}
