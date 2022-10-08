package kodlamaio;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.entities.Category;
import kodlamaio.entities.Course;
import kodlamaio.entities.Instructor;

/**
 * Fake database of kodlama.io
 */
public class DB {

    // Aslında List yerine Set kullanmak daha iyi, ancak gösterilmedi :
    public static List<Instructor> instructors = new ArrayList<Instructor>();
    public static List<Category> categories = new ArrayList<Category>();
    public static List<Course> courses = new ArrayList<Course>();

}
