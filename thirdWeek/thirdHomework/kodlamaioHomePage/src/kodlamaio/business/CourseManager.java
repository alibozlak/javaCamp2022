package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.entities.Course;

public class CourseManager implements CourseService {

    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Course course) throws Exception {
        // İş kuralları : 
        // 1) Bir kursun fiyatı 0'dan küçük olamaz
        // 2) Kurs ismi tekrar edemez

        if (course.getPrice() < 0) {
            throw new Exception("Kurs fiyatı 0'dan küçük olamaz!");
        } else {
            if (courseDao.getByName(course.getName()) != null) {
                throw new Exception(course.getName() + " isminde kurs vardır!");
            } else {
                courseDao.add(course);

                for (Logger logger : loggers) {
                    logger.log(course.getName() + " isimli kurs eklendi");
                }
            }
        }
    }

    @Override
    public void delete(int courseId) {
        courseDao.delete(courseId);

        for (Logger logger : loggers) {
            logger.log(courseId + " nolu id'ye sahip kurs silindi");
        }
    }
    
}
