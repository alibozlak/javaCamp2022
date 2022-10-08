package kodlamaio.dataAccess.hibernate;

import kodlamaio.DB;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.entities.Course;

public class HibernateCourseDao implements CourseDao {

    @Override
    public void add(Course course) {
        DB.courses.add(course);
        System.out.println(course.getName() + " kursu Hibernate ile veritabanına eklendi");
    }

    @Override
    public void delete(int courseId) {
        int sizeOfCourses = DB.courses.size();

        for (int i = 0; i < sizeOfCourses; i++) {
            if (courseId == DB.courses.get(i).getId()) {
                System.out.println(DB.courses.get(i).getName() + " kursu Hibernate ile veritabanından silindi");
                DB.courses.remove(i);
            }
        }
    }

    @Override
    public Course getByName(String courseName) {
        int sizeOfCourses = DB.courses.size();

        for (int i = 0; i < sizeOfCourses; i++) {
            if (courseName == DB.courses.get(i).getName()) {
                return DB.courses.get(i);
            }
        }

        return null;
    }
    
}
