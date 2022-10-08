package kodlamaio.business;

import kodlamaio.entities.Course;

public interface CourseService {
    void add(Course course) throws Exception;
    void delete(int courseId);
}
