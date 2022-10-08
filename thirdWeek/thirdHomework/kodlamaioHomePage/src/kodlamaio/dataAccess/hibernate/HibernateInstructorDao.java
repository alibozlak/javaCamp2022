package kodlamaio.dataAccess.hibernate;

import kodlamaio.DB;
import kodlamaio.dataAccess.InstructorDao;
import kodlamaio.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

    @Override
    public void add(Instructor instructor) {        
        DB.instructors.add(instructor);

        String fullName = instructor.getFirstName() + " " + instructor.getLastName();
        System.out.println(fullName + " adlı eğitmen Hibernate ile veritabanına eklendi");
    }

    @Override
    public void delete(int instructorId) {
        int sizeOfInstructors = DB.instructors.size();
        
        for (int i = 0; i < sizeOfInstructors; i++) {
            Instructor instructor = DB.instructors.get(i);
            if (instructorId == instructor.getId()) {
                String fullName = instructor.getFirstName() + " " + instructor.getLastName();
                DB.instructors.remove(i);
                System.out.println(fullName + " adlı eğitmen Hibernate ile veritabanından silindi");
            }
        }
    }

    @Override
    public Instructor getById(int instructorId) {
        int sizeOfInstructors = DB.instructors.size();

        for (int i = 0; i < sizeOfInstructors; i++) {
            if (instructorId == DB.instructors.get(i).getId()) {
                return DB.instructors.get(i);
            }
        }
        return null;
    }
    
}
