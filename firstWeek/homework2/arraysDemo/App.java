public class App {
    public static void main(String[] args) throws Exception {
        
        // Diziler (Arrays) :

        String[] students = {"Ahmet","Ali","Ömer","Sude","Aysu"};

        String[] teachers = new String[3];
        teachers[0] = "Yusuf";
        teachers[1] = "Gülay";
        teachers[2] = "Mehmet";

        System.out.println();
        System.out.println("Klasik for döngüsü ile, Öğretmenler :");
        for (int i = 0; i < teachers.length; i++) {
            System.out.println(teachers[i]);
        }
        
        System.out.println("foreach döngüsü ile, Öğrenciler");
        for (String student : students) {
            System.out.println(student);
        }

    }
}
