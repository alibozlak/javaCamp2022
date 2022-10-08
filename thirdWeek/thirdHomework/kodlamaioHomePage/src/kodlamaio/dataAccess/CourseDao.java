package kodlamaio.dataAccess;

import kodlamaio.entities.Course;

public interface CourseDao {
    void add(Course course);
    void delete(int courseId);
    Course getByName(String courseName);
}
