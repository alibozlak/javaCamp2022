public class App {
    public static void main(String[] args) throws Exception {
        
        // Multidimensional Array :

        String[][] cities = {
            {"İstanbul" , "Bursa" , "Edirne"},
            {"İzmir" , "Muğla" , "Aydın"},
            {"Ankara" , "Eskişehir" , "Konya"}
        };

        System.out.println();

        int length1 = cities.length;

        for (byte i = 0; i < length1; i++) {

            int length2 = cities[i].length;

            for (byte j = 0; j < length2; j++) {
                System.out.println(cities[i][j]);
            }

            System.out.println();

        }

    }
}
