package kodlamaio.business;

import kodlamaio.entities.Instructor;

public interface InstructorService {
    void add(Instructor instructor);
    void delete(int instructorId);
    Instructor getById(int instructorId);
}
