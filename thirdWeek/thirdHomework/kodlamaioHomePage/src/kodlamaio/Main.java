package kodlamaio;

import kodlamaio.business.CategoryManager;
import kodlamaio.business.CategoryService;
import kodlamaio.business.CourseManager;
import kodlamaio.business.CourseService;
import kodlamaio.business.InstructorManager;
import kodlamaio.business.InstructorService;
import kodlamaio.core.logging.EmailLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.hibernate.HibernateCategoryDao;
import kodlamaio.dataAccess.hibernate.HibernateCourseDao;
import kodlamaio.dataAccess.hibernate.HibernateInstructorDao;
import kodlamaio.dataAccess.jdbc.JdbcCategoryDao;
import kodlamaio.dataAccess.jdbc.JdbcCourseDao;
import kodlamaio.dataAccess.jdbc.JdbcInstructorDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Course;
import kodlamaio.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println();

        Logger[] loggers = { new FileLogger(), new EmailLogger() };

        Instructor enginDemirog = new Instructor(1, "Engin", "Demiroğ");

        // ********************** JDBC ***********************

        InstructorService instructorService = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorService.add(enginDemirog);    // <-- Veritabanına bir eğitmen eklendi.

        System.out.println("--------------");

        Category programlama = new Category(1, "Programlama");

        CategoryService categoryService = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryService.add(programlama);   // <-- Veritabanına bir kategori eklendi.

        System.out.println("--------------");

        Course java 
        = new Course(1, "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", enginDemirog, 0, 1);

        CourseService courseService = new CourseManager(new JdbcCourseDao(), loggers);

        // Gösterilmediği için try-catch ile exception handling yapmadım :
        courseService.add(java);

        System.out.println("--------------");


        // -------------- Yeni bir kurs eklerken iş kuralından geçememe : ----------------

        // Course negativePriceCourse 
        // = new Course(2, "JavaScript Kursu", enginDemirog, -2000, 1);
        // courseService.add(negativePriceCourse);


        // Course duplicateCourse
        // = new Course(2, "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", enginDemirog, 0, 1);
        // courseService.add(duplicateCourse);


        // --------------- Yeni bir kategori eklerken iş kuralından geçememe : ---------------

        // categoryService.add(new Category(2, "Programlama"));


        // ************************** Hibernate **********************

        Instructor instructor2 = new Instructor(2, "Can", "Yaman");
        instructorService = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorService.add(instructor2);

        System.out.println("--------------");

        Category math = new Category(2, "Matematik");
        categoryService = new CategoryManager(new HibernateCategoryDao(), loggers);
        categoryService.add(math);

        System.out.println("--------------");

        Course javaSenior 
        = new Course(2, "Senior Level Yazılım Geliştirici Yetiştirme Kampı - JAVA", enginDemirog, 0, 1);
        courseService = new CourseManager(new HibernateCourseDao(), loggers);
        courseService.add(javaSenior);

        System.out.println("--------------");

        Course js = new Course(3, "JavaScript", enginDemirog, -1500, 1);
        courseService.add(js);

        
    }
}
