package kodlamaio.dataAccess;

import kodlamaio.entities.Instructor;

public interface InstructorDao {
    void add(Instructor instructor);
    void delete(int instructorId);
    Instructor getById(int instructorId);
}
