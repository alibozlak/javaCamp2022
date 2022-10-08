package kodlamaio.entities;

public class Course {

    private int id; // --> read only
    private String name;
    private Instructor instructor;
    private double price;
    private int categoryId;
    private String imageUrl;
    private String courseDetail;

    public Course(int id, String name, Instructor instructor, double price, int categoryId) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.price = price;
        this.categoryId = categoryId;
    }

    public Course(int id, String name, Instructor instructor, double price, int categoryId, String imageUrl) {
        this(id, name, instructor, price, categoryId);
        this.imageUrl = imageUrl;
    }

    public Course(int id, String name, Instructor instructor, double price, int categoryId, String imageUrl,
            String courseDetail) {
        this(id, name, instructor, price, categoryId, imageUrl);
        this.courseDetail = courseDetail;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCourseDetail() {
        return courseDetail;
    }

    public void setCourseDetail(String courseDetail) {
        this.courseDetail = courseDetail;
    }

}
